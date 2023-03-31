package codedao;

import java.util.Objects;

public class quandui extends quan {

    public quandui(String chatlieu) {
        super(chatlieu);
    }

    public quandui(String size, String chatlieu, String mausac, String loaiongquan) {
        super(size, chatlieu, mausac, loaiongquan);
    }

    public quandui() {
    }

    @Override
    public String toString() {
        return "quandui [Size=" + Size + ", Chatlieu=" + Chatlieu + ", Mausac=" + Mausac + ", Loaiongquan="
                + Loaiongquan
                + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        quandui other = (quandui) obj;
        return Objects.equals(Chatlieu, other.Chatlieu);
    }
}
