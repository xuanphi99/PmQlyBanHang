/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.controller;

import java.util.List;
import nhom09.entity.SanPham;
import nhom09.model.getSanPham;

/**
 *
 * @author FPT
 */
public class TimKiemSanPhamController {
    public static List<SanPham> SearchSanPhams(String tenSp) {
        
        List<SanPham> list =getSanPham.LaySP(tenSp);
        
        return  list;
    }
}
