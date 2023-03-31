package codedao;

import java.util.Objects;

public class quanjean extends quan {

    public quanjean(String chatlieu) {
        super(chatlieu);
    }

    public quanjean() {
    }

    public quanjean(String size, String chatlieu, String mausac, String loaiongquan) {
        super(size, chatlieu, mausac, loaiongquan);
    }

    @Override
    public String toString() {
        return "quanjean [Size=" + Size + ", Chatlieu=" + Chatlieu + ", Mausac=" + Mausac + ", Loaiongquan="
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
        quanjean other = (quanjean) obj;
        return Objects.equals(Chatlieu, other.Chatlieu);
    }
}
