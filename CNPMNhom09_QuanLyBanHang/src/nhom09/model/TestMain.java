/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nhom09.controller.DeleteSanPhamController;
import nhom09.controller.TimKiemSanPhamController;
import nhom09.controller.UpdateSanPhamController;
import nhom09.entity.Person;

/**
 *
 * @author FPT
 */
public class TestMain {
    
  
    
     
     
    public static void main(String[] args) {

      //  System.out.println(DeleteSanPham.XoaGiaSP("4"));
        System.out.println(UpdateSanPham.SuaSanPham("8", "vớ vẩn", "14/7/2020", "15/7/2020", "sp03",12));
        System.out.println(UpdateSanPham.SuaGiaSanPham("8", 12.3,13.4));
        System.out.println(UpdateSanPhamController.checkUpDate("8", "vớ vẩn", "14/7/2020", "15/7/2020", "sp03",12, 12.3,13.4));
    }    
    
   
}
