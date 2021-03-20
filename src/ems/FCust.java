/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Deepak
 */
public class FCust extends javax.swing.JFrame {
//Connection cn;
Statement st;

   public ResultSet rs = null;
        
    public void reset(){
        
    txtfName.setText(null);
    txtlName.setText(null);
    txtconNum.setText(null);
    txtAdd.setText(null);
    cmbGender.setSelectedIndex(-1);
    btnUpdateCust.setEnabled(false);
    btnDeleteCust.setEnabled(false);
    }
    public void tableDis(){
  try {
      conn cn = new conn();
            String Query = ("select * from Cust");
            rs = cn.st.executeQuery(Query);
            tblUsers.setModel(DbUtils.resultSetToTableModel(rs));
       }
  catch (SQLException ex) {
  JOptionPane.showMessageDialog(null, ex);
  }
    }
 
    /**
     * Creates new form FUsers
     */
    public FCust() {
        initComponents();
        tableDis();
        btnUpdateCust.setEnabled(false);
        btnDeleteCust.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnUpdateCust = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDeleteCust = new javax.swing.JButton();
        btnAddCust = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbllName6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        txtfName = new javax.swing.JTextField();
        lblfName = new javax.swing.JLabel();
        lbllName = new javax.swing.JLabel();
        txtlName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lbllName1 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        lbllName2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtconNum = new javax.swing.JTextField();
        lbllName4 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtAdd = new javax.swing.JTextField();
        lbllName5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        btnUpdateCust.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateCust.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUpdateCust.setForeground(new java.awt.Color(0, 153, 153));
        btnUpdateCust.setText("Update Customer");
        btnUpdateCust.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnUpdateCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 153, 153));
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDeleteCust.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteCust.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeleteCust.setForeground(new java.awt.Color(0, 153, 153));
        btnDeleteCust.setText("Delete Customer");
        btnDeleteCust.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnDeleteCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustActionPerformed(evt);
            }
        });

        btnAddCust.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCust.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddCust.setForeground(new java.awt.Color(0, 153, 153));
        btnAddCust.setText("Add Customer");
        btnAddCust.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnAddCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateCust, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCust, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddCust, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnAddCust, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnUpdateCust, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnDeleteCust, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbllName6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbllName6.setForeground(new java.awt.Color(240, 240, 240));
        lbllName6.setText("Customer Info");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbllName6)
                .addGap(300, 300, 300))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllName6, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblUsers.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblUsers.setForeground(new java.awt.Color(0, 153, 153));
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblUsers.setGridColor(new java.awt.Color(255, 255, 255));
        tblUsers.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        txtfName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtfName.setForeground(new java.awt.Color(0, 153, 153));
        txtfName.setBorder(null);
        txtfName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtfNameInputMethodTextChanged(evt);
            }
        });
        txtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameActionPerformed(evt);
            }
        });
        txtfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfNameKeyPressed(evt);
            }
        });

        lblfName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblfName.setForeground(new java.awt.Color(0, 153, 153));
        lblfName.setText("First Name");

        lbllName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName.setForeground(new java.awt.Color(0, 153, 153));
        lbllName.setText("Last Name");

        txtlName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtlName.setForeground(new java.awt.Color(0, 153, 153));
        txtlName.setBorder(null);
        txtlName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlNameActionPerformed(evt);
            }
        });
        txtlName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlNameKeyPressed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 153, 153));
        txtSearch.setBorder(null);
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lbllName1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName1.setForeground(new java.awt.Color(0, 153, 153));
        lbllName1.setText("Search");

        cmbGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbGender.setForeground(new java.awt.Color(0, 153, 153));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        lbllName2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName2.setForeground(new java.awt.Color(0, 153, 153));
        lbllName2.setText("Gender");

        txtconNum.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtconNum.setForeground(new java.awt.Color(0, 153, 153));
        txtconNum.setBorder(null);
        txtconNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconNumActionPerformed(evt);
            }
        });
        txtconNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtconNumKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconNumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconNumKeyTyped(evt);
            }
        });

        lbllName4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName4.setForeground(new java.awt.Color(0, 153, 153));
        lbllName4.setText("Contact Number");

        txtAdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAdd.setForeground(new java.awt.Color(0, 153, 153));
        txtAdd.setBorder(null);
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        txtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddKeyPressed(evt);
            }
        });

        lbllName5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName5.setForeground(new java.awt.Color(0, 153, 153));
        lbllName5.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbllName1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbllName4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtconNum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbllName5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblfName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110)
                                        .addComponent(lbllName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110)
                                        .addComponent(lbllName2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbllName1)
                                .addGap(5, 5, 5)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfName)
                            .addComponent(lbllName)
                            .addComponent(lbllName2))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbllName5)
                                .addGap(8, 8, 8)
                                .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbllName4)
                                .addGap(8, 8, 8)
                                .addComponent(txtconNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustActionPerformed
        int op = JOptionPane.showConfirmDialog(null," Are you sure want to Update ?","Confirmation",JOptionPane.YES_NO_OPTION);
     if (op==0)
     {
    try {
        conn cn = new conn();
//        String sql= "update Login set(passWrd = '"+txtPassword.getText()+"',fName='"+txtfName.getText()+"',lName='"+txtlName+"'where usrName = '"+txtUsername.getText()+"')";
    String sql= "update Cust set CustFn='"+txtfName.getText().toLowerCase()+"',CustGen='"+cmbGender.getSelectedItem().toString().toLowerCase()+"',CustContNum='"+txtconNum.getText().toLowerCase()+"',CustAdd='"+txtAdd.getText().toLowerCase()+"'where CustLn='"+txtlName.getText().toLowerCase()+"'";
        cn.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(this,"Successfully Update"); 
        tableDis();
        reset();
        txtfName.requestFocus();
    } catch (SQLException ex) {
        Logger.getLogger(FCust.class.getName()).log(Level.SEVERE, null, ex);
    }
     }
                                                 

    }//GEN-LAST:event_btnUpdateCustActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       reset();
       txtfName.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameActionPerformed
    }//GEN-LAST:event_txtfNameActionPerformed

    private void txtfNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfNameKeyPressed
    }//GEN-LAST:event_txtfNameKeyPressed

    private void txtlNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlNameActionPerformed

    private void txtlNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlNameKeyPressed

    private void btnDeleteCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustActionPerformed
int op = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
     if (op==0)
     {
    try {
        conn cn = new conn();
       
        String sql= "delete from Cust where CustFn ='"+txtfName.getText()+"'";
        cn.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(this,"Successfully deleted"); 
        tableDis();
        reset();
        txtfName.requestFocus();
    } catch (SQLException ex) {
        Logger.getLogger(FCust.class.getName()).log(Level.SEVERE, null, ex);
    }
     }
    }//GEN-LAST:event_btnDeleteCustActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked

        try{
              DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
             int selectIndex = tblUsers.getSelectedRow();
        //model.removeRow(selectIndex);
       txtfName.setText(model.getValueAt(selectIndex,0).toString());
       txtlName.setText(model.getValueAt(selectIndex, 1).toString());
       String cmbg =(String) model.getValueAt(selectIndex, 2);
            cmbGender.addItem(cmbg);
            cmbGender.setSelectedItem(cmbg);
      txtconNum.setText(model.getValueAt(selectIndex, 3).toString());
       txtAdd.setText(model.getValueAt(selectIndex, 4).toString());
       btnUpdateCust.setEnabled(true);
       btnDeleteCust.setEnabled(true);
        }catch(Exception ex){}
        
    }//GEN-LAST:event_tblUsersMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        MaiinMenu mm = new MaiinMenu();
        mm.setVisible(true);
        this.dispose();                         
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel model = (DefaultTableModel)tblUsers.getModel();
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
        tblUsers.setRowSorter(tr);
        tr.setRowFilter(javax.swing.RowFilter.regexFilter(search));
        tableDis();
        //try{
//             // DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
//             int selectIndex = tblUsers.getSelectedRow();
//        //model.removeRow(selectIndex);
//       txtfName.setText(model.getValueAt(selectIndex, 1).toString());
//       txtlName.setText(model.getValueAt(selectIndex, 2).toString());
//      txtconNum.setText(model.getValueAt(selectIndex, 4).toString());
//       txtAdd.setText(model.getValueAt(selectIndex, 5).toString());
//        }catch(Exception ex){}
//        
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtfNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtfNameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameInputMethodTextChanged

    private void txtconNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconNumActionPerformed

    private void txtconNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconNumKeyPressed
        
    }//GEN-LAST:event_txtconNumKeyPressed

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddKeyPressed

    private void btnAddCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustActionPerformed

        try {
            if (txtfName.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please enter First name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            if (txtlName.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please enter Last name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            if ((cmbGender.getSelectedIndex()== -1)){
                JOptionPane.showMessageDialog(this, "Please enter Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            if (txtconNum.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please enter Contact Number","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            if (txtAdd.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please enter Address","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
            
        } catch (HeadlessException e) {
        }
        try{
            conn cn3 = new conn();
            String Query = ("select CustFn from Cust where CustFn='"+txtfName.getText().toLowerCase()+"'");
           rs = cn3.st.executeQuery(Query);
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "Customer name already exists");
                txtfName.setText("");
                txtfName.requestFocus();
                return;
            }
        }catch(HeadlessException e){} catch (SQLException e) {
        }

        try {
            conn cn = new conn();
            cn.st.executeUpdate("insert into Cust values('"+txtfName.getText().toLowerCase()+"','"+txtlName.getText().toLowerCase()+"','"+cmbGender.getSelectedItem().toString().toLowerCase()+"','"+txtconNum.getText()+"','"+txtAdd.getText()+"')");
            JOptionPane.showMessageDialog(null, "Data Inserted Successfull");
            tableDis();
            reset();
            txtfName.requestFocus();
        }catch(HeadlessException eee){} catch (SQLException eee) {
        }
    }//GEN-LAST:event_btnAddCustActionPerformed

    private void txtconNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconNumKeyReleased
        
    }//GEN-LAST:event_txtconNumKeyReleased

    private void txtconNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconNumKeyTyped
        char c = evt.getKeyChar();
        //if (((c == KeyEvent.VK_BACK_SPACE))|| (KeyEvent.VK_DELETE == c)){
            if ((!Character.isDigit(c))) {
                  getToolkit().beep();
                  evt.consume();
                  JOptionPane.showMessageDialog(this , "Please enter Numaic value","Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }
         if (txtconNum.getText().length()>=10) {
             getToolkit().beep();
             evt.consume();
             JOptionPane.showMessageDialog(this, "Mamium lengeth is 10","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        //}
          
             
        
//        char ch = evt.getKeyChar();
//        if(Character.isDigit(ch)){
//            //getToolkit().beep();
//          evt.consume();
//                  }
    }//GEN-LAST:event_txtconNumKeyTyped

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
            java.util.logging.Logger.getLogger(FCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FCust().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCust;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteCust;
    private javax.swing.JButton btnUpdateCust;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblfName;
    private javax.swing.JLabel lbllName;
    private javax.swing.JLabel lbllName1;
    private javax.swing.JLabel lbllName2;
    private javax.swing.JLabel lbllName4;
    private javax.swing.JLabel lbllName5;
    private javax.swing.JLabel lbllName6;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtconNum;
    private javax.swing.JTextField txtfName;
    private javax.swing.JTextField txtlName;
    // End of variables declaration//GEN-END:variables
}
