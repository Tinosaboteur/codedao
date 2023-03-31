package codedao;

import java.util.Objects;

public class quantay extends quan {

    public quantay(String chatlieu) {
        super(chatlieu);
    }

    public quantay() {
    }

    public quantay(String size, String chatlieu, String mausac, String loaiongquan) {
        super(size, chatlieu, mausac, loaiongquan);
    }

    @Override
    public String toString() {
        return "quantay [Size=" + Size + ", Chatlieu=" + Chatlieu + ", Mausac=" + Mausac + ", Loaiongquan="
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
        quantay other = (quantay) obj;
        return Objects.equals(Chatlieu, other.Chatlieu);
    }
}
