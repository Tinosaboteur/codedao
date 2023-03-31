package codedao;

import java.util.ArrayList;

public class dsquanjean {

    public ArrayList<quanjean> dsquanjean;

    public dsquanjean() {
        this.dsquanjean = new ArrayList<quanjean>();
    }

    public dsquanjean(ArrayList<quanjean> dsquanjean) {
        this.dsquanjean = dsquanjean;
    }

    // thêm quần jean
    public void themquanjean(quanjean qj) {
        this.dsquanjean.add(qj);
    }

    // in thông tin
    public void xuatthongtin() {
        for (quanjean quanjean : dsquanjean) {
            System.out.println(quanjean);
        }
    }

    // kiểm tra số lượng
    public int soluongquanjean() {
        return this.dsquanjean.size();
    }

    // làm rỗng mục quần jean
    public void lamrongDanhsach() {
        this.dsquanjean.removeAll(dsquanjean);
    }

    // kiểm tra quần jean có tồn tại hay ko
    public boolean kiemTraquanjean(quanjean qj) {
        return this.dsquanjean.contains(qj);
    }

    // xóa thông tin 1 quần jean
    public boolean xoaThongTin(quanjean qj) {
        return this.dsquanjean.remove(qj);
    }

}
