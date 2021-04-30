/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.controller;

import java.util.ArrayList;
import java.util.List;
import nhom09.model.getSanPham;

/**
 *
 * @author FPT
 */
public class getSanPhamController {
    public static List<String> laySP(){
     List<String> list = new ArrayList<>();
       list = getSanPham.getTenSP();
     return list;
    }
}
