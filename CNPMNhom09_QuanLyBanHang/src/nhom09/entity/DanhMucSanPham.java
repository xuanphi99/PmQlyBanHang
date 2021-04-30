/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.entity;

import java.util.Set;

/**
 *
 * @author FPT
 */
public class DanhMucSanPham {
    private String maDanhMuc ;
    private String tenDanhMuc;
    private Set<SanPham> sanPhams ; // 1 danhmuc có N sanPham

    public DanhMucSanPham() {
    }

    public DanhMucSanPham(String maDanhMuc, String tenDanhMuc, Set<SanPham> sanPhams) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
        this.sanPhams = sanPhams;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public Set<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(Set<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }
    
}
