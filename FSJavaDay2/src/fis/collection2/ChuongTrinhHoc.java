package fis.collection2;

import java.util.*;

public class ChuongTrinhHoc {
    private String ten;
    private Calendar ngayDuocDuyet;
    private List<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
    private List<Diem> dsDiem = new ArrayList<Diem>();
    public static ChuongTrinhHoc SINGLETON = new ChuongTrinhHoc("Cong nghe thong tin", new GregorianCalendar(2000,0,1));

    private ChuongTrinhHoc(String ten, Calendar ngayDuocDuyet) {
        this.ten = ten;
        this.ngayDuocDuyet = ngayDuocDuyet;
    }

    public boolean addMonHoc(MonHoc monHoc){
        return this.dsMonHoc.add(monHoc);
    }
    public List<MonHoc> getDsMonHoc(){
    	return this.dsMonHoc;
    }
    public List<Diem> getDsDiem(){
    	return this.dsDiem;
    }
}
