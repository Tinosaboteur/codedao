package codedao;

import java.util.ArrayList;

public class dsquantay {

    public ArrayList<quantay> dsquantay;

    public dsquantay() {
        this.dsquantay = new ArrayList<quantay>();
    }

    public dsquantay(ArrayList<quantay> dsquantay) {
        this.dsquantay = dsquantay;
    }

    // thêm quần tay
    public void themquantay(quantay qt) {
        this.dsquantay.add(qt);
    }

    // in thông tin
    public void xuatthongtin() {
        for (quantay quantay : dsquantay) {
            System.out.println(quantay);
        }
    }

    // kiểm tra số lượng
    public int soluongquantay() {
        return this.dsquantay.size();
    }

    // làm rỗng mục quần tây
    public void lamrongDanhsach() {
        this.dsquantay.removeAll(dsquantay);
    }

    // kiểm tra quần tây có tồn tại hay ko
    public boolean kiemTraquanjean(quantay qt) {
        return this.dsquantay.contains(qt);
    }

    // xóa thông tin 1 quần tây
    public boolean xoaThongTin(quantay qt) {
        return this.dsquantay.remove(qt);
    }

}
