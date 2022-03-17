package fis.collection1;


public class Main {
	public static void main(String[] args) {
		MonHoc m = new MonHoc("Hoang",1,1);
		MonHoc o = new MonHoc("Hoa",11,11);
		LopHoc l = new LopHoc("Ba","Roi Beo");
		
		LopHoc g = new LopHoc("Thay","Giao X");
		Diem d = new Diem(m,14);
		Diem i = new Diem(o,44);
		Diem mq = new Diem(m,1);
		SinhVien s = new SinhVien("abc","Hoang");
		s.themDiem(i);
		s.themDiem(d);
		s.themDiem(mq);
		l.them(s);
		System.out.print(s.bangDiem());
		System.out.println("Diem trung binh :" + s.tinhDiemTrungBinh());
		System.out.print(l.inDiem());
		System.out.print(l.top10());
//		String str = String.format("%-3s | %-20s | %-10s |", "STT","TEN MON","DIEM");
//		System.out.println(str);
//		System.out.println(String.format("%-3s | %-20s | %-10s |", "1","Toan","20"));
//		System.out.println(String.format("%-3s | %-20s | %-10s |", "2","Sinh","10"));
//		System.out.println(String.format("%-3s | %-20s | %-10s |", "3","Lap trinh oop Java","DIEM"));
//		System.out.println(String.format("%-3s | %-20s | %-10s |", "STT","TEN MON","DIEM"));
//		System.out.println(String.format("%-3s | %-20s | %-10s |", "STT","TEN MON","DIEM"));
//		System.out.println(String.format("%-3s | %-20s | %-10s |", "STT","TEN MON","DIEM"));
		
		
	}
}
