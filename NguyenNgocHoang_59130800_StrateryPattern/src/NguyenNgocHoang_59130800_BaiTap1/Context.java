
package NguyenNgocHoang_59130800_BaiTap1;


public class Context {
    ITinh tinhToan;

    public void setTinh(ITinh tinh) {
        this.tinhToan = tinh;
    }
  
    public float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    }
}
