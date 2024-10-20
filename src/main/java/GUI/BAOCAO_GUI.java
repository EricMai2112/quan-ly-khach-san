/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author 84837
 */
public class BAOCAO_GUI extends javax.swing.JFrame {
        boolean isClickedQLP = false;
	boolean isClickedDV = false;
    /**
     * Creates new form BAOCAO_GUI
     */
    public BAOCAO_GUI() {
        initComponents();
        
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
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Báo cáo lễ tân");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 197, 197)));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Phòng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(608, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Phòng trống cả ngày");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jLabel7.setMaximumSize(new java.awt.Dimension(137, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(137, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(137, 50));
        jLabel7.setRequestFocusEnabled(false);
        jPanel5.add(jLabel7, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText(">");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel5.add(jLabel9, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Phòng đang sử dụng");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jLabel10.setMaximumSize(new java.awt.Dimension(137, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(137, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(137, 50));
        jLabel10.setRequestFocusEnabled(false);
        jPanel7.add(jLabel10, java.awt.BorderLayout.CENTER);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText(">");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel7.add(jLabel12, java.awt.BorderLayout.LINE_END);
        jPanel7.add(jSeparator1, java.awt.BorderLayout.PAGE_START);
        jPanel7.add(jSeparator5, java.awt.BorderLayout.PAGE_END);

        jPanel4.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Tổng tiền trong ngày");
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jLabel13.setMaximumSize(new java.awt.Dimension(137, 20));
        jLabel13.setMinimumSize(new java.awt.Dimension(137, 20));
        jLabel13.setPreferredSize(new java.awt.Dimension(137, 50));
        jLabel13.setRequestFocusEnabled(false);
        jPanel8.add(jLabel13, java.awt.BorderLayout.CENTER);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText(">");
        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel8.add(jLabel14, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel8);
        jPanel4.add(jSeparator6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(BAOCAO_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BAOCAO_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BAOCAO_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BAOCAO_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BAOCAO_GUI().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel panelDV;
    private javax.swing.JPanel panelQLP;
    // End of variables declaration//GEN-END:variables
}
