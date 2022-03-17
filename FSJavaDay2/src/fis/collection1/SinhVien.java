package fis.collection1;

import java.util.*;

public class SinhVien {
  private String mssv;
  private String ten;

  private Set<Diem> monDaHoc = new HashSet<Diem>();

  public SinhVien() {
	  
  }
  public SinhVien(String mssv, String ten){
    this.mssv = mssv;
    this.ten = ten;
  }
  public String getMSSV() {
	  return this.mssv;
  }
  public String getTen() {
	  return this.ten;
  }
  public boolean themDiem(Diem diemMoi){
    return this.monDaHoc.add(diemMoi);
  }

  //Cau 1
  public double tinhDiemTrungBinh(){
    //Giong nhu cach tinh hien tai cua truong

    //...
	 OptionalDouble avg;
	 avg = monDaHoc.stream()
			 			.mapToDouble(t -> t.getDiem())
			 			.average();
    return avg.isPresent() ? avg.getAsDouble() : 0.0d;
  }


  //Cau 2
  public String bangDiem(){
    /*
     MSSV : 0203044
     Ten  : Nguyen Van A
     Danh Sach Diem
     STT  Ten Mon             Diem       So Tin Chi
     1    Cau Truc Du Lieu 1  8          3
     2    Cau Truc Du Lieu 2  8          3
     Diem Trung Binh   8.0
    */
    //...
	  int count = 1;
	  StringBuilder sbd = new StringBuilder();
	  sbd.append(String.format("MSSV : %-4s \n", getMSSV()));
	  sbd.append(String.format("Ten  : %-4s \n", getTen()));
	  sbd.append(String.format("%-4s","Danh sach mon \n"));
	  sbd.append(String.format("%-4s  %-20s  %-4s \n", "STT","Ten Mon","Diem"));
	  for(Diem d: monDaHoc) {
		  sbd.append(String.format(" %-3s  %-20s  %-3s \n", count,d.getMon().getTen(),d.getDiem()));
		  count++;
	  }
    return sbd.toString();
  }


  //Cau 3
  public String xepLoai(){
    /*
    Quy tac xep loai nhu sau
        DiemTB < 5 -> YEU
        DiemTB >= 5 va DiemTB < 6 -> TB
        DiemTB >= 6 va DiemTB < 7 -> TB-KHA
        DiemTB >= 7 va DiemTB < 8 -> KHA
        DiemTB >= 8 -> GIOI
    */

    //...
	  String pr = "";
	  double rank = tinhDiemTrungBinh();
	  if(rank < 5) {
		  pr = "YEU";	
	  	}else if(rank >= 5 && rank < 6) {
	  		pr = "TB";
	  	}else if(rank >= 6 && rank < 7) {
	  		pr = "TB-KHA";
	  	}else if(rank >= 7 && rank < 8) {
	  		pr = "KHA";
	  	}else {
	  		pr = "GIOI";
	  	}
	  return pr;
  	}
}
