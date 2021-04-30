/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.controller;

import nhom09.model.AddGiaSanPham;
import nhom09.model.AddProducts;

/**
 *
 * @author FPT
 */
public class ThemGiaController {
    public static boolean ThemGiaSP(String MasanPham , double  giaNhap , double  giaBan){
        if (  AddGiaSanPham.themGiaSanPham(MasanPham, giaNhap, giaBan)<0) {
            return false;
        }
    return true;
    }
}
