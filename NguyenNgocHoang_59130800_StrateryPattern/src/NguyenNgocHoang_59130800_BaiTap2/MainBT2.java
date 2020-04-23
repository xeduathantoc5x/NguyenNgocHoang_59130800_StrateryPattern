
package NguyenNgocHoang_59130800_BaiTap2;


public class MainBT2 {

    public static void main(String[] args) {
      
        HangHoa hh1 = new HangHoa("Tu lanh Toshiba",12000000,"tien nghi - khong chat bao quan");
        HangHoa hh2 = new HangHoa("Ti vi LG", 5700000,"dep - sieu mong");
        HangHoa hh3 = new HangHoa("Laptop Dell Inspiron core i7", 300000,"phim led sieu dep");
        
        GioHang giohang1 = new GioHang();
       GioHang giohang2 = new GioHang();
       
       
//       IThanhToan ITT1 =new ThanhToanOnline();
       giohang1.setHinhThucTT(new ThanhToanOnline());
       giohang2.setHinhThucTT(new ThanhToanCOD());
       
       giohang1.themHH(hh1);
       giohang1.themHH(hh2);
       giohang1.themHH(hh3);
       giohang2.themHH(hh3);
       
        System.out.println("thong tin gio hang 1: ");
        System.out.println("danh sach hang hoa gio hang 1: " );
        giohang1.hienthiGioHang();
        System.out.println(" tong tien hang hoa:  "+giohang1.tongTienHangHoa());
        System.out.println(" tong tien khach hang phai tra: "+giohang1.tienKhachHangPhaiTra());
        
       System.out.println("thong tin gio hang 2: ");
       System.out.println("danh sach hang hoa gio hang 2: " );
        giohang2.hienthiGioHang();
        System.out.println("tong tien hang hoa:  "+giohang2.tongTienHangHoa());
        System.out.println("tong tien khach hang phai tra: "+giohang2.tienKhachHangPhaiTra());
    }
    
}
