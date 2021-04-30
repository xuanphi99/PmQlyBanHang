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
import java.util.List;
import nhom09.entity.*;

/**
 *
 * @author FPT
 */
public class getSanPham {
    
    public static DanhMucSanPham LayTenDM(String maSp){
       Connection c = getConnection.getDataConnection();
       DanhMucSanPham dm = new DanhMucSanPham();
            try {
          String sql  = "SELECT *  FRom sanpham as sp, danhmucsanpham as dm where sp.maSanPham  = ? and sp.maDanhMuc = dm.maDanhMuc    ";   
           PreparedStatement pre  = c.prepareStatement(sql);  
             pre.setString(1,maSp );
            ResultSet resultSet1 = pre.executeQuery();  
          while (resultSet1.next()) {
              
              dm.setTenDanhMuc(resultSet1.getString("tenDanhMuc"));
              dm.setMaDanhMuc(resultSet1.getString("maDanhMuc"));
            }  
            
            
            } catch (Exception e) {
            }
        return dm;
    }
    
    
    public static List<SanPham> LaySP(String tenSP){
       Connection c = getConnection.getDataConnection();
       List<SanPham> list = new ArrayList<>();
            try {
          String sql  = "SELECT * FRom sanpham where tenSanPham like  ?   ";   
           PreparedStatement pre  = c.prepareStatement(sql);  
             pre.setString(1,tenSP+"%" );
            ResultSet resultSet1 = pre.executeQuery();  
          while (resultSet1.next()) {
            SanPham s  = new SanPham();
            s.setMasanPham(resultSet1.getString("maSanPham"));
            s.setTenSanPham(resultSet1.getString("tenSanPham"));
            s.setNgayXS(resultSet1.getString("ngayXS"));
            s.setHanSD(resultSet1.getString("hanSD"));
            s.setDanhMucSanPham(LayTenDM(resultSet1.getString("maSanPham")));
            s.setSoLuong(resultSet1.getInt("soLuong"));
           list.add(s);
            
            }  
            
            
            } catch (Exception e) {
            }
        return list; 
    }
    
    public static List<Double>  getGiaSPByName(String maSp){
        Connection c = getConnection.getDataConnection();
      List<Double> list = new ArrayList<>();
            try {
          String sql  = "SELECT *  FRom  gia as g where g.maSanPham  = ?   ";   
           PreparedStatement pre  = c.prepareStatement(sql);  
             pre.setString(1,maSp );
            ResultSet resultSet1 = pre.executeQuery();  
          while (resultSet1.next()) {
              
             list.add(resultSet1.getDouble("giaBan"));
             list.add(resultSet1.getDouble("giaNhap"));
            
            }  
            
            
            } catch (Exception e) {
            }
       return list;
    }
    public static List<String>  getTenSP(){
        Connection c = getConnection.getDataConnection();
      List<String> list = new ArrayList<>();
            try {
          String sql  = "SELECT sanpham.tenSanPham  FRom  sanpham    ";   
           PreparedStatement pre  = c.prepareStatement(sql);  
           
            ResultSet resultSet1 = pre.executeQuery();  
          while (resultSet1.next()) {
              
             list.add(resultSet1.getString("tenSanPham"));
           
            
            }  
            
            
            } catch (Exception e) {
            }
       return list;
    }
    
//    
//    public static void main(String[] args) {
//         List<String> list = getMaSP();
//         System.out.println("size"+ list.size());
//        
//    }
    
}
