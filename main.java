package codedao;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dsquandui dsquandui = new dsquandui();
        dsquanjean dsquanjean = new dsquanjean();
        dsquantay dsquantay = new dsquantay();
        int a;

        do {
            System.out.println("Hay chon MENU cho chuong trinh.");
            System.out.println("1.Them muc quan.");
            System.out.println("2.In ra man hinh danh muc quan.");
            System.out.println("3.Lay so luong quan.");
            System.out.println("4.Lam rong danh muc quan.");
            System.out.println("5.Xoa 1 loai quan ra khoi danh sach.");
            System.out.println("6.Thoat khoi chuong trinh");
            a = input.nextInt();
            if (a < 1 || a > 6) {
                System.out.println("Vui long chon lai!!!");
            } else {
                switch (a) {
                    case 1: {
                        System.out.println("Hay chon loai quan duoc them vao.");
                        System.out.println("1.Quan dui.");
                        System.out.println("2.Quan jean.");
                        System.out.println("3.Quan tay.");
                        a = input.nextInt();
                        switch (a) {
                            case 1: {
                                quandui quandui = new quandui();
                                System.out.println("Hay nhap vao Size quan:");
                                input.nextLine();
                                String Size = input.nextLine();
                                System.out.println("Hay nhap vao chat lieu quan:");
                                String Chatlieu = input.nextLine();
                                System.out.println("Hay nhap vao mau sac cua quan:");
                                String Mausac = input.nextLine();
                                System.out.println("Hay nhap vao loai ong quan:");
                                String Loaiongquan = input.nextLine();
                                quandui = new quandui(Size, Chatlieu, Mausac, Loaiongquan);
                                dsquandui.themquandui(quandui);
                                break;
                            }
                            case 2: {
                                quanjean quanjean = new quanjean();
                                System.out.println("Hay nhap vao Size quan:");
                                input.nextLine();
                                String Size = input.nextLine();
                                System.out.println("Hay nhap vao chat lieu quan:");
                                String Chatlieu = input.nextLine();
                                System.out.println("Hay nhap vao mau sac cua quan:");
                                String Mausac = input.nextLine();
                                System.out.println("Hay nhap vao loai ong quan:");
                                String Loaiongquan = input.nextLine();
                                quanjean = new quanjean(Size, Chatlieu, Mausac, Loaiongquan);
                                dsquanjean.themquanjean(quanjean);
                                break;
                            }
                            case 3: {
                                quantay quantay = new quantay();
                                System.out.println("Hay nhap vao Size quan:");
                                input.nextLine();
                                String Size = input.nextLine();
                                System.out.println("Hay nhap vao chat lieu quan:");
                                String Chatlieu = input.nextLine();
                                System.out.println("Hay nhap vao mau sac cua quan:");
                                String Mausac = input.nextLine();
                                System.out.println("Hay nhap vao loai ong quan:");
                                String Loaiongquan = input.nextLine();
                                quantay = new quantay(Size, Chatlieu, Mausac, Loaiongquan);
                                dsquantay.themquantay(quantay);
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Hay chon loai quan muon in ra:");
                        System.out.println("1.Quan dui.");
                        System.out.println("2.Quan jean.");
                        System.out.println("3.Quan tay.");
                        a = input.nextInt();
                        switch (a) {
                            case 1: {
                                dsquandui.xuatthongtin();
                                break;
                            }
                            case 2: {
                                dsquanjean.xuatthongtin();
                                break;
                            }
                            case 3: {
                                dsquantay.xuatthongtin();
                                break;
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Chon loai quan muon thong ke so luong.");
                        System.out.println("1.Quan dui.");
                        System.out.println("2.Quan jean.");
                        System.out.println("3.Quan tay.");
                        a = input.nextInt();
                        switch (a) {
                            case 1: {
                                System.out.println("So luong quan dui la: " + dsquandui.soluongquandui());
                                break;
                            }
                            case 2: {
                                System.out.println("So luong quan dui la: " + dsquanjean.soluongquanjean());
                                break;
                            }
                            case 3: {
                                System.out.println("So luong quan dui la: " + dsquantay.soluongquantay());
                                break;
                            }
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Chon danh sach can lam rong:");
                        System.out.println("1.Quan dui.");
                        System.out.println("2.Quan jean.");
                        System.out.println("3.Quan tay.");
                        a = input.nextInt();
                        switch (a) {
                            case 1: {
                                dsquandui.lamrongDanhsach();
                                break;
                            }
                            case 2: {
                                dsquanjean.lamrongDanhsach();
                                break;
                            }
                            case 3: {
                                dsquantay.lamrongDanhsach();
                                break;
                            }
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("Chon loai quan can xoa ra khoi danh sach:");
                        System.out.println("1.Quan dui.");
                        System.out.println("2.Quan jean.");
                        System.out.println("3.Quan tay.");
                        a = input.nextInt();
                        switch (a) {
                            case 1: {
                                System.out.println("Hay nhap vao chat lieu quan muon xoa.");
                                input.nextLine();
                                String Chatlieu = input.nextLine();
                                quandui quandui = new quandui(Chatlieu);
                                System.out.println("Xoa quan dui: " + dsquandui.xoaThongTin(quandui));
                                break;
                            }
                            case 2: {
                                System.out.println("Hay nhap vao chat lieu quan muon xoa.");
                                input.nextLine();
                                String Chatlieu = input.nextLine();
                                quanjean quanjean = new quanjean(Chatlieu);
                                System.out.println("Xoa quan dui: " + dsquanjean.xoaThongTin(quanjean));
                                break;
                            }
                            case 3: {
                                System.out.println("Hay nhap vao chat lieu quan muon xoa.");
                                input.nextLine();
                                String Chatlieu = input.nextLine();
                                quantay quantay = new quantay(Chatlieu);
                                System.out.println("Xoa quan dui: " + dsquantay.xoaThongTin(quantay));
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        } while (a != 6);
        input.close();
    }
}
