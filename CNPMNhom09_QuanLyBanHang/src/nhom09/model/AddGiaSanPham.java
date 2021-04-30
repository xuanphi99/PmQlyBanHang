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
public class AddGiaSanPham {
     public static int themGiaSanPham( String MasanPham , double  giaNhap , double  giaBan){
          Connection c = getConnection.getDataConnection();
          int x= -1;
          try {
          String sql  = " Insert INTO gia(maSanPham,giaNhap,giaBan)  values (?,?,?)";
          PreparedStatement pre  = c.prepareStatement(sql);   
           pre.setString(1, MasanPham);
           pre.setDouble(2, giaNhap);
           pre.setDouble(3, giaBan);
        
           x = pre.executeUpdate();
              
        } catch (Exception e) {
        }
          return  x;
          
    }
}
