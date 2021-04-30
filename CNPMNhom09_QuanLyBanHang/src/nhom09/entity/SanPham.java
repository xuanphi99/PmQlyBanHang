/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.entity;

import java.util.Date;

/**
 *
 * @author FPT
 */
public class SanPham {
    private String MasanPham ;
    private String tenSanPham;
    private String ngayXS, HanSD; 
    private DanhMucSanPham danhMucSanPham ; // 1 sanPham chỉ thuộc 1 danhmuc nào đó
    private int soLuong;

    public SanPham() {
    }

    public SanPham(String MasanPham, String tenSanPham, String ngayXS, String HanSD, DanhMucSanPham danhMucSanPham, int soLuong) {
        this.MasanPham = MasanPham;
        this.tenSanPham = tenSanPham;
        this.ngayXS = ngayXS;
        this.HanSD = HanSD;
        this.danhMucSanPham = danhMucSanPham;
        this.soLuong = soLuong;
    }

    public String getMasanPham() {
        return MasanPham;
    }

    public void setMasanPham(String MasanPham) {
        this.MasanPham = MasanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNgayXS() {
        return ngayXS;
    }

    public void setNgayXS(String ngayXS) {
        this.ngayXS = ngayXS;
    }

    public String getHanSD() {
        return HanSD;
    }

    public void setHanSD(String HanSD) {
        this.HanSD = HanSD;
    }

    public DanhMucSanPham getDanhMucSanPham() {
        return danhMucSanPham;
    }

    public void setDanhMucSanPham(DanhMucSanPham danhMucSanPham) {
        this.danhMucSanPham = danhMucSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
