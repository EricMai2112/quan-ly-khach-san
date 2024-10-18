/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.table.JTableHeader;

/**
 *
 * @author 84837
 */
public class DICHVU_GUI extends javax.swing.JFrame {
        boolean isClickedQLP = false;
	boolean isClickedDV = false;
    /**
     * Creates new form DICHVU_GUI
     */
    public DICHVU_GUI() {
        initComponents();
        
        editHeaderTable();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQLP = new javax.swing.JButton();
        panelQLP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnQLDV = new javax.swing.JButton();
        panelDV = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnTKGC = new javax.swing.JButton();
        btnTKGC1 = new javax.swing.JButton();
        btnTKGC2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(27, 41, 189));
        jPanel1.setAlignmentY(1.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(170, 542));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/logo.png"))); // NOI18N
        jLabel1.setText("TQSN");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel1.add(jLabel1);

        btnQLP.setBackground(new java.awt.Color(27, 41, 189));
        btnQLP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLP.setForeground(new java.awt.Color(255, 255, 255));
        btnQLP.setText(" Quản lý phòng      >");
        btnQLP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQLP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLP.setMaximumSize(new java.awt.Dimension(200, 40));
        btnQLP.setMinimumSize(new java.awt.Dimension(76, 30));
        btnQLP.setPreferredSize(new java.awt.Dimension(76, 30));
        btnQLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLPActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLP);

        panelQLP.setBackground(new java.awt.Color(255, 255, 255));
        panelQLP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 41, 189)));
        panelQLP.setMaximumSize(new java.awt.Dimension(400, 80));
        panelQLP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hóa đơn phòng");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelQLP.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sơ đồ phòng");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelQLP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));
        panelQLP.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 10));

        jPanel1.add(panelQLP);

        btnQLDV.setBackground(new java.awt.Color(27, 41, 189));
        btnQLDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLDV.setForeground(new java.awt.Color(255, 255, 255));
        btnQLDV.setText(" Quản lý dịch vụ     >");
        btnQLDV.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQLDV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLDV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLDV.setMaximumSize(new java.awt.Dimension(200, 40));
        btnQLDV.setMinimumSize(new java.awt.Dimension(76, 30));
        btnQLDV.setPreferredSize(new java.awt.Dimension(76, 30));
        btnQLDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDVActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLDV);

        panelDV.setBackground(new java.awt.Color(255, 255, 255));
        panelDV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 41, 189)));
        panelDV.setMaximumSize(new java.awt.Dimension(400, 80));
        panelDV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Danh sách dịch vụ");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelDV.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hóa đơn bán lẻ");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelDV.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 40));
        panelDV.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 10));

        jPanel1.add(panelDV);

        btnTKGC.setBackground(new java.awt.Color(27, 41, 189));
        btnTKGC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTKGC.setForeground(new java.awt.Color(255, 255, 255));
        btnTKGC.setText(" Thống kê giao ca");
        btnTKGC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTKGC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTKGC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTKGC.setMaximumSize(new java.awt.Dimension(200, 40));
        btnTKGC.setMinimumSize(new java.awt.Dimension(76, 30));
        btnTKGC.setPreferredSize(new java.awt.Dimension(76, 30));
        btnTKGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKGCActionPerformed(evt);
            }
        });
        jPanel1.add(btnTKGC);

        btnTKGC1.setBackground(new java.awt.Color(27, 41, 189));
        btnTKGC1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTKGC1.setForeground(new java.awt.Color(255, 255, 255));
        btnTKGC1.setText(" Khuyến mãi");
        btnTKGC1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTKGC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTKGC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTKGC1.setMaximumSize(new java.awt.Dimension(200, 40));
        btnTKGC1.setMinimumSize(new java.awt.Dimension(76, 30));
        btnTKGC1.setPreferredSize(new java.awt.Dimension(76, 30));
        btnTKGC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKGC1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTKGC1);

        btnTKGC2.setBackground(new java.awt.Color(27, 41, 189));
        btnTKGC2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTKGC2.setForeground(new java.awt.Color(255, 255, 255));
        btnTKGC2.setText("Báo cáo lễ tân");
        btnTKGC2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTKGC2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTKGC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTKGC2.setMaximumSize(new java.awt.Dimension(200, 40));
        btnTKGC2.setMinimumSize(new java.awt.Dimension(76, 30));
        btnTKGC2.setPreferredSize(new java.awt.Dimension(76, 30));
        btnTKGC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKGC2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTKGC2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Dịch vụ");

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/delete.png"))); // NOI18N
        jLabel6.setText("Xóa");
        jLabel6.setIconTextGap(10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(245, 109, 40));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/fixing.png"))); // NOI18N
        jLabel7.setText("Cập nhật");
        jLabel7.setIconTextGap(10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(25, 159, 254));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/add.png"))); // NOI18N
        jLabel8.setText("Thêm dịch vụ");
        jLabel8.setIconTextGap(10);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null},
                {"", null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn vị tính", "Đơn giá", "Số lượng", "Chọn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLPActionPerformed
        if(isClickedQLP) {
            panelQLP.setVisible(false);
            btnQLP.setText(" Quản lý phòng      >");
        }else {
            panelQLP.setVisible(true);
            btnQLP.setText(" Quản lý phòng      \u02C5");
        }
        isClickedQLP = !isClickedQLP;
    }//GEN-LAST:event_btnQLPActionPerformed

    private void btnQLDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDVActionPerformed
        // TODO add your handling code here:
        if(isClickedDV) {
            panelDV.setVisible(false);
            btnQLDV.setText(" Quản lý dịch vụ     >");
        }else {
            panelDV.setVisible(true);
            btnQLDV.setText(" Quản lý dịch vụ     \u02C5");
        }
        isClickedDV = !isClickedDV;
    }//GEN-LAST:event_btnQLDVActionPerformed

    private void btnTKGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKGCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTKGCActionPerformed

    private void btnTKGC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKGC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTKGC1ActionPerformed

    private void btnTKGC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKGC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTKGC2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void editHeaderTable() {
    	JTableHeader header = jTable1.getTableHeader();
    	header.setFont(new Font("Times new Romans", Font.BOLD, 14));
    	
    }
    
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
            java.util.logging.Logger.getLogger(DICHVU_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DICHVU_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DICHVU_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DICHVU_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DICHVU_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLDV;
    private javax.swing.JButton btnQLP;
    private javax.swing.JButton btnTKGC;
    private javax.swing.JButton btnTKGC1;
    private javax.swing.JButton btnTKGC2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelDV;
    private javax.swing.JPanel panelQLP;
    // End of variables declaration//GEN-END:variables
}
