package fis.collection2;
import java.util.ArrayList;
import java.util.List;
public class SinhVien {
    private String masv;
    private String ten;
    private BangDiem bangDiem;

    public SinhVien(String masv, String ten, BangDiem bangDiem) {
        this.ten = ten;
        this.masv = masv;
        this.bangDiem = bangDiem;
    }

    //Xem ky dinh nghia giong nhau
    public boolean equals(Object that){
        if(that == null) return false;
        if (!(that instanceof SinhVien))
            return false;
        SinhVien thatSinhVien = (SinhVien) that;
        return this.ten.equals(thatSinhVien.ten) && this.masv.equals(thatSinhVien.masv);
    }

    //
    //Cau 1 : Sinh vien chi co the dang ky hoc 1 mon hoc khi
    //- Mon hoc do nam trong chuong trinh.
    //- Sinh vien phai chua dau mon hoc do
    //- Phai dau tat ca cac mon tien quyet cua mon hoc do.
    //Chu y:
    //   Mon hoc co nhieu diem diem cua mon do la diem cuoi cung
    //   Doc yeu cau that ky nha neu ko thoa thi ko co diem dau do
    public boolean coTheDangKyHoc(MonHoc monHoc) {
        //TODO
    		ChuongTrinhHoc.SINGLETON.getDsMonHoc();
    		/*
    		 * getDsMonHoc
    		 * if(!DsMonHoc.contain(MonHoc)) return false;
    		 * 
    		 * getMonHoc tu Bang Diem (Result : Mon Hoc , DsDiem)
    		 * 		if(MonHoc != null) 
    		 * 			if(KiemTraDiemDaDau) return false;
    		 * 		
    		 * 		
    		 * Lay Ds cac mon kien quyet(Dua theo mon hoc)
    		 * 			Duyet tung mon , kiem tra diem da dau		
    		 * 					if(!Kiemtradiemdadau) return false;
    		 * 	return true;				
    		 */
    		List<Diem> lastDiem = new ArrayList<Diem>() ;
    		if(!ChuongTrinhHoc.SINGLETON.getDsMonHoc().contains(monHoc)) return false;
    		if(monHoc != null) {
    			for(Diem d : lastDiem) {
    				if(d.getDiemCuoiCung() > 5) return false;
    			}
    		}
    		return true;
    		
    }

    public BangDiem getBangDiem() {
        return bangDiem;
    }
}
