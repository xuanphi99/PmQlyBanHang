/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author FPT
 */
public class DeleteSanPham {
    public  static int XoaGiaSP(String maSp){
        int x= -1;
         Connection c = getConnection.getDataConnection();
         try {
           String sql =  "DELETE FROM gia WHERE maSanPham = ? ";      
            PreparedStatement pre  = c.prepareStatement(sql);
           
             pre.setString(1, maSp);
               System.out.println(sql);
             x = pre.executeUpdate();
        } catch (Exception e) {  
            e.printStackTrace();
    }
         return x;
    }      
    public  static int XoaSP(String maSp){
        int x= -1;
         Connection c = getConnection.getDataConnection();
         try {
           String sql =  "DELETE FROM sanpham WHERE maSanPham = ? ";      
            PreparedStatement pre  = c.prepareStatement(sql);
             pre.setString(1, maSp);
             x = pre.executeUpdate();
        } catch (Exception e) {   
            e.printStackTrace();
    }
         return x;
    }      
    
}
