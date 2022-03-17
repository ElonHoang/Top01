package fis.collection2;
import java.util.*;

public class PhieuDangKyHocPhan {
    private SinhVien sv;
    private List<MonHoc> dsMonHoc = new ArrayList<MonHoc>();

    private DotDangKyHocPhan dotDangKy;
    private List<SinhVien> dsSv = new ArrayList<SinhVien>();

    public PhieuDangKyHocPhan(SinhVien sv, DotDangKyHocPhan dotDangKy){
        this.sv = sv;
        this.dotDangKy = dotDangKy;
        this.dotDangKy.themPhieuDangKyHocPhan(this);
    }

    public boolean addMonHoc(MonHoc monHoc){
        return dsMonHoc.add(monHoc);
    }

    //Cau 2 : Mot phieu dang ky hoc phan duoc xem la hop le
    // khi cac mon hoc do sinh vien chon hoc deu hop le.
    public boolean laHopLe(){
        //TODO
    	for(MonHoc p : dsMonHoc) {
    		p.getDsMonTienQuyet();
    	}
        return false;
    }
}
