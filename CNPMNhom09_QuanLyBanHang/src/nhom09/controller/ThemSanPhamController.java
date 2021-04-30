/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.controller;

import nhom09.model.AddProducts;

/**
 *
 * @author FPT
 */
public class ThemSanPhamController {
    public static boolean themSP(String MasanPham , String tenSanPham,int soLuong , String maDM,   String  ngayXS, String  HanSD){
        if ( AddProducts.themSanPham(MasanPham, tenSanPham, soLuong, maDM, ngayXS, HanSD)<0) {
            return false;
        }
        else return true;
    }
}
