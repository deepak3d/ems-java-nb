/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import javax.swing.JOptionPane;

/**
 *
 * @author Deepak
 */
public class MaiinMenu extends javax.swing.JFrame {

    public MaiinMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbllName6 = new javax.swing.JLabel();
        btnPurchase = new javax.swing.JButton();
        btnUsers1 = new javax.swing.JButton();
        btnSupp = new javax.swing.JButton();
        btnSales1 = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnStocks2 = new javax.swing.JButton();
        btnSwitchUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        lbllName6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbllName6.setForeground(new java.awt.Color(0, 153, 153));
        lbllName6.setText("Elecetornic Store Management");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(lbllName6, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllName6, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 70, 1090, 90);

        btnPurchase.setBackground(new java.awt.Color(255, 255, 255));
        btnPurchase.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(0, 153, 153));
        btnPurchase.setText("Purchase");
        btnPurchase.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });
        jPanel2.add(btnPurchase);
        btnPurchase.setBounds(720, 200, 230, 130);

        btnUsers1.setBackground(new java.awt.Color(255, 255, 255));
        btnUsers1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUsers1.setForeground(new java.awt.Color(0, 153, 153));
        btnUsers1.setText("Users");
        btnUsers1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnUsers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsers1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnUsers1);
        btnUsers1.setBounds(140, 200, 230, 130);

        btnSupp.setBackground(new java.awt.Color(255, 255, 255));
        btnSupp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSupp.setForeground(new java.awt.Color(0, 153, 153));
        btnSupp.setText("Supplieres/Customers");
        btnSupp.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppActionPerformed(evt);
            }
        });
        jPanel2.add(btnSupp);
        btnSupp.setBounds(140, 380, 230, 130);

        btnSales1.setBackground(new java.awt.Color(255, 255, 255));
        btnSales1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSales1.setForeground(new java.awt.Color(0, 153, 153));
        btnSales1.setText("Sales");
        btnSales1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSales1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSales1);
        btnSales1.setBounds(430, 200, 230, 130);

        btnReports.setBackground(new java.awt.Color(255, 255, 255));
        btnReports.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnReports.setForeground(new java.awt.Color(0, 153, 153));
        btnReports.setText("Reports");
        btnReports.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(btnReports);
        btnReports.setBounds(720, 380, 230, 130);

        btnStocks2.setBackground(new java.awt.Color(255, 255, 255));
        btnStocks2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnStocks2.setForeground(new java.awt.Color(0, 153, 153));
        btnStocks2.setText("Stocks");
        btnStocks2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnStocks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStocks2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnStocks2);
        btnStocks2.setBounds(430, 380, 230, 130);

        btnSwitchUser.setBackground(new java.awt.Color(255, 255, 255));
        btnSwitchUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSwitchUser.setForeground(new java.awt.Color(0, 153, 153));
        btnSwitchUser.setText("Switch User");
        btnSwitchUser.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSwitchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnSwitchUser);
        btnSwitchUser.setBounds(430, 550, 230, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsers1ActionPerformed
        FUsers fu = new FUsers();
        fu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUsers1ActionPerformed

    private void btnSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppActionPerformed
        FSupCut fsc = new FSupCut();
        fsc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSuppActionPerformed

    private void btnSwitchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchUserActionPerformed
        LoginPage lp = new LoginPage();
        int op = JOptionPane.showConfirmDialog(null, " Are you sure want to Log Out ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            lp.setVisible(true);
            this.dispose();
        } // end if
    }//GEN-LAST:event_btnSwitchUserActionPerformed

    private void btnStocks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStocks2ActionPerformed

        FStock fst = new FStock();
        fst.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStocks2ActionPerformed

    private void btnSales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSales1ActionPerformed
        FSales fsls = new FSales();
        fsls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSales1ActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        FPurchase fp = new FPurchase();
        fp.setVisible(true);
    }//GEN-LAST:event_btnPurchaseActionPerformed

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
            java.util.logging.Logger.getLogger(MaiinMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaiinMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaiinMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaiinMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MaiinMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSales1;
    private javax.swing.JButton btnStocks2;
    private javax.swing.JButton btnSupp;
    private javax.swing.JButton btnSwitchUser;
    private javax.swing.JButton btnUsers1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbllName6;
    // End of variables declaration//GEN-END:variables
}