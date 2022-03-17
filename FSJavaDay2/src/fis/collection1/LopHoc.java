package fis.collection1;

import java.util.*;
import java.util.stream.Collectors;

public class LopHoc {
  private String ten;
  private String giaoVien;
  private List<SinhVien> dsLop = new ArrayList<SinhVien>();

  public LopHoc() {
	  
  }
  public LopHoc(String ten, String giaoVien){
    this.ten = ten;
    this.giaoVien = giaoVien;
  }
  public String getTen() {
	  return this.ten;
  }
  public String getGiaoVien() {
	  return this.giaoVien;
  }

  public boolean them(SinhVien svMoi){
    return dsLop.add(svMoi);
  }

  //Cau 4
  public String inDiem(){
    /*
    Danh Sach Diem Lop : ten
    Giao Vien Chu Nhiem : giaoVien
    STT      MSSV        Ten              Diem TB   XepLoai
    1        123456      Nguyen Van A     8.4       GIOI
    2        678919      Nguyen Van B     6         TB-KHA
    3        112456      Nguyen Van C     7         KHA
    */
    //...

	  int count = 1;
	  StringBuilder sbd = new StringBuilder();
	  sbd.append(String.format("Danh sach diem lop : %-14s \n", getTen()));
	  sbd.append(String.format("Giao vien chu nhiem  : %-14s \n", getGiaoVien()));
	  sbd.append(String.format("%-4s  %-7s  %-15s %-4s %-8s \n", "STT","MSSV","Ten","DiemTB","XepLoai"));
	  for(SinhVien s: dsLop) {
		  sbd.append(String.format("%-4s  %-7s  %-15s %-4s %-8s \n", count,s.getMSSV(),s.getTen(),s.tinhDiemTrungBinh(),s.xepLoai()));
		  count++;
	  }
    return sbd.toString();
  }

  //Cau 5
  public List<SinhVien> top10(){
    //Tra ve danh sach 10 sinh vien co diem trung binh lon nhat lop
    //...
	  List<SinhVien> top10;
	  	top10 = dsLop.stream()
	  						.sorted(Comparator.comparing(t -> t.tinhDiemTrungBinh()))
	  						.limit(10)
	  						.collect(Collectors.toList()); 
    return top10;
  }

  //Cau 6
  public List<SinhVien> sinhVienYeu(){
    //Tra ve danh sach vien vien xep loai YEU
    //...
	  List<SinhVien> sv  = new ArrayList();
	  		dsLop.forEach(t ->{
	  				if(t.tinhDiemTrungBinh() < 5) {
	  					System.out.println("Ten" + t.getTen() + "\n");
	  						sv.add(t);
		  }
	  });
	  			
    return sv;
  }
}
