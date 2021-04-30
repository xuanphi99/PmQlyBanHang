/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.controller;

import nhom09.model.DeleteSanPham;

/**
 *
 * @author FPT
 */
public class DeleteSanPhamController {
    public static boolean checkXoaSP(String maSp){
        if (DeleteSanPham.XoaGiaSP(maSp)>0 && DeleteSanPham.XoaSP(maSp)>0) {
        //    if (DeleteSanPham.XoaSP(maSp)>0) {
                return true;
           // }
        }
        
        return false;
    }
}
