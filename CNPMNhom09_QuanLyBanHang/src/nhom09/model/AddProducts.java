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
public class AddProducts {
    public static int themSanPham( String MasanPham , String tenSanPham,int soLuong , String maDM,   String  ngayXS, String  HanSD ){
          Connection c = getConnection.getDataConnection();
          int x= -1;
          try {
          String sql  = " Insert INTO sanpham(maSanPham,tenSanPham,ngayXS,hanSD,maDanhMuc,soLuong)  values (?,?,?,?,?,?)";
          PreparedStatement pre  = c.prepareStatement(sql);   
           pre.setString(1, MasanPham);
           pre.setString(2, tenSanPham);
           pre.setString(3, ngayXS);
           pre.setString(4, HanSD);
           pre.setString(5, maDM);
           pre.setInt(6, soLuong);
           x = pre.executeUpdate();
              
        } catch (Exception e) {
        }
          return  x;
          
    }
}
