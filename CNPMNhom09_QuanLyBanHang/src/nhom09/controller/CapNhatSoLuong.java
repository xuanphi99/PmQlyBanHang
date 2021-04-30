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
public class CapNhatSoLuong {
    public static boolean  UpdateSouongController( int soluong,String tensp) {
        
        return UpdateSanPham.UpdateSouongModel(soluong,tensp);
    }
}
