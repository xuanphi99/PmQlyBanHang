/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.controller;

import nhom09.model.UpdateSanPham;

/**
 *
 * @author FPT
 */
public class UpdateSanPhamController {
    public static boolean checkUpDate(String MasanPham,String tenSanPham,String ngayXS, String HanSD, String MadanhMuc , int soLuong, Double giaNhap ,Double giaBan ){
        if (UpdateSanPham.SuaGiaSanPham(MasanPham, giaNhap, giaBan)>0 && UpdateSanPham.SuaSanPham(MasanPham, tenSanPham, ngayXS, HanSD, MadanhMuc, soLuong)>0) {
            return true;
        }
        return false;
    }
}
