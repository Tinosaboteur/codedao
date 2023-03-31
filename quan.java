package codedao;

public abstract class quan {

    protected String Size, Chatlieu, Mausac, Loaiongquan;

    public quan(String size, String chatlieu, String mausac, String loaiongquan) {
        Size = size;
        Chatlieu = chatlieu;
        Mausac = mausac;
        Loaiongquan = loaiongquan;
    }

    public quan(String chatlieu) {
        Chatlieu = chatlieu;
    }

    public quan() {
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getChatlieu() {
        return Chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        Chatlieu = chatlieu;
    }

    public String getMausac() {
        return Mausac;
    }

    public void setMausac(String mausac) {
        Mausac = mausac;
    }

    public String getLoaiongquan() {
        return Loaiongquan;
    }

    public void setLoaiongquan(String loaiongquan) {
        Loaiongquan = loaiongquan;
    }

    public String toString() {
        return Size + Chatlieu + Mausac + Loaiongquan;
    }
}
