/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import nhom09.entity.DanhMucSanPham;

/**
 *
 * @author FPT
 */
public class UpdateSanPham {
    public static int SuaSanPham( String MasanPham,String tenSanPham,String ngayXS, String HanSD, String MadanhMuc , int soLuong ){

      int x= -1;
       Connection c = getConnection.getDataConnection();
        try {
       String query = "update sanpham set maSanPham = ? , tenSanPham= ?, ngayXS = ? , hanSD = ? , maDanhMuc = ? , soLuong= ?  where maSanPham = ? ";     
        PreparedStatement pre  = c.prepareStatement(query);       
        pre.setString(1, MasanPham);
        pre.setString(2, tenSanPham);
        pre.setString(3, ngayXS);
        pre.setString(4, HanSD);
        pre.setString(5, MadanhMuc);
        pre.setInt(6, soLuong);
         pre.setString(7, MasanPham);
         x= pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
      
      return x;
    }
    public static int SuaGiaSanPham( String MasanPham, Double giaNhap ,Double giaBan ){

      int x= -1;
       Connection c = getConnection.getDataConnection();
        try {
       String query = "update gia set maSanPham = ? , giaNhap= ?, giaBan = ?   where maSanPham = ? ";     
        PreparedStatement pre  = c.prepareStatement(query);       
        pre.setString(1, MasanPham);
        pre.setDouble(2, giaNhap);
        pre.setDouble(3, giaBan);
       pre.setString(4, MasanPham); 
        x= pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
      
      return x;
    }

    public static boolean UpdateSouongModel( int soluong,String tensp) {
         int x= -1;
          Connection c = getConnection.getDataConnection();
          try {
          String query = "update sanpham set soLuong =  ?   where tenSanPham = ?  ";   
             PreparedStatement pre  = c.prepareStatement(query);       
        pre.setInt(1, soluong);
        pre.setString(2, tensp);
        x= pre.executeUpdate();
        } catch (Exception e) {
        }
          if (x==-1) {
            return  false;
                    
        }
          else return true;
    }
}
