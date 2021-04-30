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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author FPT
 */
public class getDataDanhMucSanPham {
    public static  Set<String> getTenDanhMuc(){
        Set<String> set = new HashSet<>();
        Connection c = getConnection.getDataConnection();
        try {
           String query = "SELECT * from danhmucsanpham ";
           PreparedStatement pre  = c.prepareStatement(query);
           ResultSet resultSet = pre.executeQuery();
            while (resultSet.next()) {                
              set.add(resultSet.getString("tenDanhMuc"));
            }
           
           
        } catch (Exception e) {
        
            
    }
        return  set;
    }  
    
    public static String  getCategoryByName(String nameCategory){
    
       Connection c = getConnection.getDataConnection();
        try {
       String query = "SELECT maDanhMuc from danhmucsanpham where tenDanhMuc = ? ";
        PreparedStatement pre  = c.prepareStatement(query);
        pre.setString(1, nameCategory);
        ResultSet resultSet = pre.executeQuery();
        while (resultSet.next()) { 
         return resultSet.getString("maDanhMuc");
        }
        
        
        } catch (Exception e) {
        }
       
       return null;
       
    
    }
    
    
  //  public static void main(String[] args) {
//        Set<String> ListTenDM = getTenDanhMuc();
//        for (String i : ListTenDM) {
//            System.out.println(i);
//        }
//        if (getCategoryByName("Sữa tươi")!=null) {
//            System.out.println("co");
//        }
//        else
//            System.out.println("NO");
//    }
    
    
}
