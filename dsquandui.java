package codedao;

import java.util.ArrayList;

public class dsquandui {

    public ArrayList<quandui> dsquandui;

    public dsquandui() {
        this.dsquandui = new ArrayList<quandui>();
    }

    public dsquandui(ArrayList<quandui> dsquandui) {
        this.dsquandui = dsquandui;
    }

    // thêm quần đùi
    public void themquandui(quandui qd) {
        this.dsquandui.add(qd);
    }

    // xuất thông tin
    public void xuatthongtin() {
        for (quandui quandui : dsquandui) {
            System.out.println(quandui);
        }
    }

    // kiểm tra số lượng
    public int soluongquandui() {
        return this.dsquandui.size();
    }

    // làm rỗng mục quần đùi
    public void lamrongDanhsach() {
        this.dsquandui.removeAll(dsquandui);
    }

    // kiểm tra quần đùi có tồn tại hay ko
    public boolean kiemTraquandui(quandui qd) {
        return this.dsquandui.contains(qd);
    }

    // xóa thông tin 1 quần đùi
    public boolean xoaThongTin(quandui qd) {
        return this.dsquandui.remove(qd);
    }

}
