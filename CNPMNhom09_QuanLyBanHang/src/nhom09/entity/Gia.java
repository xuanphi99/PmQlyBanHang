/**
*   Today is a good day ^^.
*   User : Lam 
*/

package nhom09.entity;

import java.util.List;


public class Gia {
    private List<SanPham> sanPhams;
    private double giaBanSanPham;
    private double giaNhapSanPham;

    public Gia() {
    }

    public Gia(List<SanPham> sanPhams, double giaBanSanPham, double giaNhapSanPham) {
        this.sanPhams = sanPhams;
        this.giaBanSanPham = giaBanSanPham;
        this.giaNhapSanPham = giaNhapSanPham;
    }

    public List<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(List<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public double getGiaBanSanPham() {
        return giaBanSanPham;
    }

    public void setGiaBanSanPham(double giaBanSanPham) {
        this.giaBanSanPham = giaBanSanPham;
    }

    public double getGiaNhapSanPham() {
        return giaNhapSanPham;
    }

    public void setGiaNhapSanPham(double giaNhapSanPham) {
        this.giaNhapSanPham = giaNhapSanPham;
    }

  
    
}
