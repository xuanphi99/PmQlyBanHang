/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom09.view;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import nhom09.controller.CapNhatSoLuong;
import nhom09.controller.TimKiemSanPhamController;
import nhom09.controller.getSanPhamController;
import nhom09.entity.SanPham;
import nhom09.model.getSanPham;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author FPT
 */
public class MainNhanVienBanHang extends javax.swing.JFrame {

  
   private int flag,soluongMua;
   private  List<String> listChon;
   private  Set<String> setSp;
   private  List<SanPham>  listSp;
    public MainNhanVienBanHang() {
       listChon = new ArrayList<>();
       setSp = new HashSet<>();
        flag=1;soluongMua=0;
        initComponents();
        jComboBox1.removeAllItems();
         List<String> list = new ArrayList<>();
         list = getSanPhamController.laySP();
         for (String i : list) {
            jComboBox1.addItem(i);
        }

    }
 
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhan vien ban hang");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom09/view/logOut.png"))); // NOI18N
        jLabel1.setText("Log Out");
        jLabel1.setToolTipText("Đăng xuất khỏi hệ thống");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VAT", "tenSanPham", "SoLuong", "Gia San Pham"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton3.setText("xuất ra Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Danh sach San Pham");

        jButton1.setText("Xem hoa don");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 665, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
      
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
     
         
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // chon sp
      
        try {
           
        if (flag==0) {
              int check =0;
             String str  = jComboBox1.getSelectedItem().toString();
          listSp = TimKiemSanPhamController.SearchSanPhams(str);
             setSp.add(listSp.get(0).getTenSanPham());
           
      //    System.out.println("so luong cua"+listSp.get(0).getTenSanPham()+"la "+listSp.get(0).getSoLuong());
            if (checkSoLuongMua(listSp.get(0).getTenSanPham())<listSp.get(0).getSoLuong() ) {   
                listChon.add(listSp.get(0).getTenSanPham());

            }
            else {            
           JOptionPane.showMessageDialog(null, "da het san pham trong kho ");
           check=1;
           
            }          
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();                         
                  for (int i = 0; i < dtm.getRowCount(); i++) {
                    
                      if (jComboBox1.getSelectedItem().equals(dtm.getValueAt(i, 1))) {
                          dtm.setValueAt(checkSoLuongMua(str), i, 2);
                          check=2;
                          break;
                      }
                  }
        

                        
           jTable2.updateUI();
                  if (check==0) {
                 List<Double> listDoubles = getSanPham.getGiaSPByName(listSp.get(0).getMasanPham());
         dtm.addRow(new Object[]{"2",jComboBox1.getSelectedItem(),checkSoLuongMua(str),listDoubles.get(0)}); 

                  }
                  System.out.println(check);
              }  
            
     //   }
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
     flag=0;
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       boolean flag = false;
         DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel(); 
             for (int i = 0; i < dtm.getRowCount()-1; i++) {
                List<SanPham>  a  = new ArrayList<>();
                 String str =dtm.getValueAt(i, 1).toString();
                 a= TimKiemSanPhamController.SearchSanPhams(str);
              flag =CapNhatSoLuong.UpdateSouongController(a.get(0).getSoLuong()-Integer.parseInt(dtm.getValueAt(i, 2).toString()),dtm.getValueAt(i, 1).toString());
             }
          if (flag) {
             WriteToExcel();
       JOptionPane.showMessageDialog(null, "Xuat hoa don thanh cong");
        }
   
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // xem hoa don
         DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel(); 
        Double gia = 0.0;
        int sum =0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            sum+=Integer.parseInt(dtm.getValueAt(i, 2).toString());
            Double gia1sp = Double.parseDouble(dtm.getValueAt(i, 3).toString());
            int soluong  = Integer.parseInt(dtm.getValueAt(i, 2).toString());
            gia+= ((Double.parseDouble(dtm.getValueAt(i, 0).toString())/100)*gia1sp + gia1sp ) * soluong  ;
        }
         
          dtm.insertRow(dtm.getRowCount(), new Object[]{"","","tong so mat hang mua  :"+sum,"tong tien = "+ Math.round(gia) +"VND"});
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainNhanVienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainNhanVienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainNhanVienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainNhanVienBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainNhanVienBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

  
    
    private String getValuesRow(int r, int c){
    DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
    return dtm.getValueAt(r, c).toString();
}

    
    private void WriteToExcel() {
         DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
          try {
            //FileOutputStream fos = new FileOutputStream("Data.xlsx");
              XSSFWorkbook xssfw = new XSSFWorkbook();
              XSSFSheet xSSFSheet = xssfw.createSheet();
           //load data to TreeMap
              HashMap<Integer,Object[]> data = new HashMap<>();
              data.put(0, new Object[]{dtm.getColumnName(0),dtm.getColumnName(1),
              dtm.getColumnName(2),dtm.getColumnName(3)});
              for (int i = 1; i <= dtm.getRowCount(); i++) {
 data.put(i, new Object[]{getValuesRow(i-1, 0),getValuesRow(i-1, 1),getValuesRow(i-1, 2),getValuesRow(i-1, 3)} );
              }
                      
        Set<Integer > s  = data.keySet();
              XSSFRow row ;
              int rowId =0;
              for (Integer key : s)
              {
                  row = xSSFSheet.createRow(rowId++);
                  Object[] vObjects = data.get(key);
                  int cellId =0;
                  for (Object v : vObjects) {
                      XSSFCell cell = row.createCell(cellId++);
                      cell.setCellValue(v.toString());
                  }
              }
         JFileChooser f  = new JFileChooser();
      f.setDialogTitle("Chọn nơi luu trữ");
      int x = f.showSaveDialog(f);
        if (x==JFileChooser.APPROVE_OPTION) {
            File fi = f.getSelectedFile();
          String ur = fi.getAbsoluteFile()+".xlsx";
             FileOutputStream fos = new FileOutputStream(ur);
              xssfw.write(fos);
              xssfw.close();
              fos.close();
            System.out.println(ur);
        }
    
             
    
        } catch (Exception e) {
            e.printStackTrace();
        }
          
          
    }

    private int checkSoLuongMua(String tenSanPham) {
           return tanxuat(tenSanPham);
    }

    private int tanxuat(String tenSanPham) {
        int tx=0;
        for (String i : setSp) {

            int dem =0;
            if (i.equals(tenSanPham)) {
                 for (String j : listChon) {
                     if (  j.equals(i)) {
                    dem++;
                    }
                 }
          tx=dem;
            }

           
           
        }
        
        return tx;
        }
    
    
}
