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
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Deepak
 */
public class FPurchase extends javax.swing.JFrame {
     public ResultSet rs = null;
    public void reset(){
        
    cmbScustName.setSelectedIndex(-1);
    cmbScustProd.setSelectedIndex(-1);
    cmbSPBrand.setSelectedIndex(-1);
    cmbSProCat.setSelectedIndex(-1);
    txtpPrice.setText(null);
    txtpQun.setText(null);
    lbltotPrice.setText("00.00");
    lbltotQuan.setText("00.00");
    lbltotGr.setText("00.00");
    btnReFromCart.setEnabled(false);
    btnRemoveall.setEnabled(false);
    }
     public void tableDis(){
  try {
      conn cn = new conn();
            String Query = ("select * from Stock");
            rs = cn.st.executeQuery(Query);
            tblSalesCart.setModel(DbUtils.resultSetToTableModel(rs));
       }
  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
       }
    }
     public void CmbCustNameFun(){
        try{
            conn cn3 = new conn();
            String Query = ("select * from Cust");
            rs = cn3.st.executeQuery(Query);   
        while(rs.next()){
            cmbScustName.addItem(rs.getString("CustFn"));
            }
        }catch(HeadlessException e){} catch (SQLException e) {}
    }
     public void CmbProdNameFun(){
        try{
            conn cn3 = new conn();
            String Query = ("select * from Stock");
            rs = cn3.st.executeQuery(Query);   
        while(rs.next()){
            cmbScustProd.addItem(rs.getString("pName"));
            }
        }catch(HeadlessException e){} catch (SQLException e) {}
    }
     public void CmbProdBrandNameFun(){
        try{
            conn cn3 = new conn();
            String Query = ("select * from Brand");
            rs = cn3.st.executeQuery(Query);   
        while(rs.next()){
            cmbSPBrand.addItem(rs.getString("BrandName"));
            }
        }catch(HeadlessException e){} catch (SQLException e) {}
    }
     public void CmbProdCatFun(){
        try{
            conn cn3 = new conn();
            String Query = ("select * from Cat");
            rs = cn3.st.executeQuery(Query);   
        while(rs.next()){
            cmbSProCat.addItem(rs.getString("Category"));
            }
        }catch(HeadlessException e){} catch (SQLException e) {}
    }
     public void InvoiceNoFun(){
          try {
          conn cn3 = new conn();
            String Query = ("select * from Sales where InvoiceId = 1");
            rs = cn3.st.executeQuery(Query);   
        if(rs.next()){
              inid.setText(rs.getString("InvoiceId"));   
          }  
      } catch (SQLException e) {
      int i = Integer.valueOf(inid.getText());
              i++;
              inid.setText(String.valueOf(i));
      }
      
     }
      public void ProdTOTCalfun(){     
        Double qt = Double.valueOf(txtpQun.getText());
        Double price = Double.valueOf(txtpPrice.getText());
        Double tot ;
        tot = qt * price;
        lbltotPrice.setText(String.valueOf(tot));
 
 } 
      public void CartTOTFun(){
           int numofrow = tblSalesCart.getRowCount();
        double total = 0;
     for (int i = 0; i < numofrow; i++) {
         double value = Double.valueOf(tblSalesCart.getValueAt(i, 7).toString());
         total += value ;
     }
    lbltotGr.setText(Double.toString(total));
   int numofrows = tblSalesCart.getRowCount();
    double totals = 0;
     for (int i = 0; i < numofrows; i++) {
         double values = Double.valueOf(tblSalesCart.getValueAt(i, 5).toString());
         totals += values ;
     }
    lbltotQuan.setText(Double.toString(totals));
 }
      public void tot(){  
// Double paid = Double.valueOf(paid_amt.getText());
//       Double tot = Double.valueOf(bill_tot.getText());
//       Double due ;
//       due =  paid -tot ;
//       balance.setText(String.valueOf(due));
 }
      public void createColfun(){
          DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();
          dt.addColumn("Invoice Number");
          dt.addColumn("Customer Name");
          dt.addColumn("ProductName");
          dt.addColumn("ProductBrand");
          dt.addColumn("ProductCategory");
          dt.addColumn("ProductQuantity");
          dt.addColumn("ProductPrice");
          dt.addColumn("ToatalPrice");
      }
      public void Pop(String cn,String pn,String pb,String pc){
          DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();

          String[] rowData={cn,pn,pb,pc};
          dt.addRow(rowData);
      }
      public void CmbAutoSelFun(){
//          String  pname =cmbScustProd.getSelectedItem().toString();
//           try {
//          conn cn3 = new conn();
//            String Query = ("select pBrand,pCat,pQuantity,pPrice from Stock where pName = '"+pname+"'");
////            String Query = ("select pBrand,pCat,pDesc,pQuantity,pPrice from Stock where pName = '"+pname+"'");
////            String Query = ("select pBrand,pCat from Stock where pName = '"+pname+"'");
//            rs = cn3.st.executeQuery(Query);   
//                if(rs.next()){
//                cmbSProCat.addItem(rs.getString("pCat"));
//                cmbSProCat.getSelectedItem();
//                cmbSPBrand.addItem(rs.getString("BrandName"));
//                cmbSPBrand.getSelectedItem();
//                txtpPrice.setText(rs.getString("pPrice"));
//                txtpQun.setText(rs.getString("pQuantity"));
//          } 
//                ProdTOTCalfun();
//      } catch (SQLException e) {}
      }


    /**
     * Creates new form FSales
     */
    public FPurchase() {
        initComponents();
         btnReFromCart.setEnabled(false);
         btnRemoveall.setEnabled(false);
        //tableDis();
         CmbCustNameFun();
         CmbProdNameFun();
         CmbProdBrandNameFun();
         CmbProdCatFun();
         InvoiceNoFun();
         createColfun();
         CmbAutoSelFun();
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
        btnAddTOCart = new javax.swing.JButton();
        btnReFromCart = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRemoveall = new javax.swing.JButton();
        btnPayNPrint = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbltotPrice = new javax.swing.JLabel();
        lbllName14 = new javax.swing.JLabel();
        lbllName15 = new javax.swing.JLabel();
        lbltotQuan = new javax.swing.JLabel();
        lbltotGr = new javax.swing.JLabel();
        lbllName16 = new javax.swing.JLabel();
        inid = new javax.swing.JLabel();
        lbllName8 = new javax.swing.JLabel();
        lbllName9 = new javax.swing.JLabel();
        cmbScustName = new javax.swing.JComboBox();
        lbllName10 = new javax.swing.JLabel();
        cmbScustProd = new javax.swing.JComboBox();
        lbllName11 = new javax.swing.JLabel();
        cmbSPBrand = new javax.swing.JComboBox();
        lbllName12 = new javax.swing.JLabel();
        cmbSProCat = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesCart = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbllName13 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblfName1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtpPrice = new javax.swing.JTextField();
        lblfName2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtpQun = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        btnAddTOCart.setBackground(new java.awt.Color(255, 255, 255));
        btnAddTOCart.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddTOCart.setForeground(new java.awt.Color(0, 153, 153));
        btnAddTOCart.setText("Add to Cart");
        btnAddTOCart.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnAddTOCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTOCartActionPerformed(evt);
            }
        });

        btnReFromCart.setBackground(new java.awt.Color(255, 255, 255));
        btnReFromCart.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnReFromCart.setForeground(new java.awt.Color(0, 153, 153));
        btnReFromCart.setText("Remove from Cart");
        btnReFromCart.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnReFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReFromCartActionPerformed(evt);
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

        btnRemoveall.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveall.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRemoveall.setForeground(new java.awt.Color(0, 153, 153));
        btnRemoveall.setText("Remove all");
        btnRemoveall.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnRemoveall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveallActionPerformed(evt);
            }
        });

        btnPayNPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPayNPrint.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPayNPrint.setForeground(new java.awt.Color(0, 153, 153));
        btnPayNPrint.setText("Buy & Print");
        btnPayNPrint.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPayNPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayNPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddTOCart, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReFromCart, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveall, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayNPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnAddTOCart, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnReFromCart, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnRemoveall, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPayNPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbltotPrice.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbltotPrice.setForeground(new java.awt.Color(240, 240, 240));
        lbltotPrice.setText("00.00");

        lbllName14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbllName14.setForeground(new java.awt.Color(240, 240, 240));
        lbllName14.setText("Total price");

        lbllName15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbllName15.setForeground(new java.awt.Color(240, 240, 240));
        lbllName15.setText("Total Quantity");

        lbltotQuan.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbltotQuan.setForeground(new java.awt.Color(240, 240, 240));
        lbltotQuan.setText("00.00");

        lbltotGr.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbltotGr.setForeground(new java.awt.Color(240, 240, 240));
        lbltotGr.setText("00.00");

        lbllName16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbllName16.setForeground(new java.awt.Color(240, 240, 240));
        lbllName16.setText("Gross Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbllName15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotQuan)
                .addGap(46, 46, 46)
                .addComponent(lbllName14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(lbllName16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotGr)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbllName16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotGr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbllName14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbllName15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        inid.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        inid.setForeground(new java.awt.Color(0, 153, 153));
        inid.setText("1");

        lbllName8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbllName8.setForeground(new java.awt.Color(0, 153, 153));
        lbllName8.setText("Invoice no:");

        lbllName9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName9.setForeground(new java.awt.Color(0, 153, 153));
        lbllName9.setText("Supplier Name");

        cmbScustName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbScustName.setForeground(new java.awt.Color(0, 153, 153));

        lbllName10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName10.setForeground(new java.awt.Color(0, 153, 153));
        lbllName10.setText("Product Name");

        cmbScustProd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbScustProd.setForeground(new java.awt.Color(0, 153, 153));
        cmbScustProd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbScustProdItemStateChanged(evt);
            }
        });
        cmbScustProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbScustProdActionPerformed(evt);
            }
        });

        lbllName11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName11.setForeground(new java.awt.Color(0, 153, 153));
        lbllName11.setText("Product Brand");

        cmbSPBrand.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbSPBrand.setForeground(new java.awt.Color(0, 153, 153));

        lbllName12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbllName12.setForeground(new java.awt.Color(0, 153, 153));
        lbllName12.setText("Product Category");

        cmbSProCat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbSProCat.setForeground(new java.awt.Color(0, 153, 153));

        tblSalesCart.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblSalesCart.setForeground(new java.awt.Color(0, 153, 153));
        tblSalesCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSalesCart.setGridColor(new java.awt.Color(255, 255, 255));
        tblSalesCart.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblSalesCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSalesCartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSalesCart);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        lbllName13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbllName13.setForeground(new java.awt.Color(240, 240, 240));
        lbllName13.setText("Purchase");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addComponent(lbllName13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllName13, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        lblfName1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblfName1.setForeground(new java.awt.Color(0, 153, 153));
        lblfName1.setText("Product Quantity");

        txtpPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtpPrice.setForeground(new java.awt.Color(0, 153, 153));
        txtpPrice.setBorder(null);
        txtpPrice.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtpPriceInputMethodTextChanged(evt);
            }
        });
        txtpPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpPriceActionPerformed(evt);
            }
        });
        txtpPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpPriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpPriceKeyTyped(evt);
            }
        });

        lblfName2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblfName2.setForeground(new java.awt.Color(0, 153, 153));
        lblfName2.setText("Product Price");

        txtpQun.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtpQun.setForeground(new java.awt.Color(0, 153, 153));
        txtpQun.setBorder(null);
        txtpQun.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtpQunInputMethodTextChanged(evt);
            }
        });
        txtpQun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpQunActionPerformed(evt);
            }
        });
        txtpQun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpQunKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpQunKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpQunKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblfName1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblfName2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtpQun, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(txtpPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(182, 182, 182))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(506, 506, 506)
                                .addComponent(lbllName8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(inid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lbllName9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lbllName10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(lbllName11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(lbllName12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(cmbScustName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cmbScustProd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cmbSPBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cmbSProCat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbllName8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllName9)
                    .addComponent(lbllName10)
                    .addComponent(lbllName11)
                    .addComponent(lbllName12))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbScustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbScustProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSPBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSProCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfName1)
                    .addComponent(lblfName2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpQun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTOCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTOCartActionPerformed

//            DefaultTableModel model = (DefaultTableModel) tblSalesCart.getModel();
//             int selectIndex = tblSalesCart.getSelectedRow();
        //model.removeRow(selectIndex);
//         DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();
           
//        Vector v = new Vector();
//        v.add(inid.getText()); // invoice id
//        v.add(cmbScustProd.getSelectedItem().toString());
//        v.add(cmbSPBrand.getSelectedItem().toString());
//        dt.addRow(v);
//        
//        Pop(cmbScustName.getSelectedItem().toString(), cmbScustProd.getSelectedItem().toString(), cmbSPBrand.getSelectedItem().toString(), cmbSProCat.getSelectedItem().toString());
            DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();
            dt.addRow(new Object[]{inid.getText(),cmbScustName.getSelectedItem().toString(), cmbScustProd.getSelectedItem().toString(), cmbSPBrand.getSelectedItem().toString(), cmbSProCat.getSelectedItem().toString(),txtpQun.getText(),txtpPrice.getText(),lbltotPrice.getText()});
            CartTOTFun();
            btnReFromCart.setEnabled(true);
            btnRemoveall.setEnabled(true);
    }//GEN-LAST:event_btnAddTOCartActionPerformed

    private void btnReFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReFromCartActionPerformed
        try {
            
            DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();
            int rw = tblSalesCart.getSelectedRow();
            dt.removeRow(rw);    
        } catch (Exception e) {}
        CartTOTFun();
         tot(); 
    }//GEN-LAST:event_btnReFromCartActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       reset();
       DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();
            dt.setRowCount(0);
            CartTOTFun();
            tot();
       cmbScustName.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveallActionPerformed
            DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();
            dt.setRowCount(0);
            CartTOTFun();
            tot();  
    }//GEN-LAST:event_btnRemoveallActionPerformed

    private void tblSalesCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalesCartMouseClicked

        try{
            DefaultTableModel model = (DefaultTableModel) tblSalesCart.getModel();
            int selectIndex = tblSalesCart.getSelectedRow();
        }catch(Exception ex){}

    }//GEN-LAST:event_tblSalesCartMouseClicked

    private void btnPayNPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayNPrintActionPerformed
  try {
                        
          DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();
          int rc = dt.getRowCount();
          
            for (int i = 0; i < rc; i++) {
                
                String inID = dt.getValueAt(i, 0).toString(); 
                String custName = dt.getValueAt(i, 1).toString(); 
                String prodName = dt.getValueAt(i, 2).toString(); 
                String prodBrand = dt.getValueAt(i, 3).toString();
                String prodCat = dt.getValueAt(i, 4).toString(); 
                String prodQuan = dt.getValueAt(i, 5).toString();
                String prodPrice = dt.getValueAt(i, 6).toString();
                String SCtotPrice = dt.getValueAt(i, 7).toString(); 
                
                String totPrice = lbltotPrice.getText();
                String totgrPrice = lbltotGr.getText();
           
                
            conn cn = new conn();
            cn.st.executeUpdate("insert into SalesCart values('"+inID+"','"+prodName+"','"+prodBrand+"','"+prodQuan+"','"+prodPrice+"','"+totPrice+"','"+totgrPrice+"')");
            JOptionPane.showMessageDialog(null, "Data Inserted Successfull");
            //reset();           
            }
            
                JOptionPane.showMessageDialog(null, "Data Seved");
            
        } catch (HeadlessException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
         }
  
        try {
                       
//              DefaultTableModel dt = (DefaultTableModel) tblSalesCart.getModel();
//          int rc = dt.getRowCount();
//          
//            for (int i = 0; i < rc; i++) {
//                
//                String inID = dt.getValueAt(i, 0).toString(); 
//                String custName = dt.getValueAt(i, 1).toString(); 
//                String prodName = dt.getValueAt(i, 2).toString(); 
//                String prodBrand = dt.getValueAt(i, 3).toString();
//                String prodCat = dt.getValueAt(i, 4).toString(); 
//                String prodQuan = dt.getValueAt(i, 5).toString();
//                String prodPrice = dt.getValueAt(i, 6).toString();
//                String SCtotPrice = dt.getValueAt(i, 7).toString(); 
//                
//                String totPrice = lbltotPrice.getText();
//                String totgrPrice = lbltotGr.getText();
//           
                   
            String invid = inid.getText();
            String cname  = cmbScustName.getSelectedItem().toString();
            String totquan = lbltotQuan.getText();
            String totGR = lbltotGr.getText();           
             
             conn cn = new conn();
             cn.st.executeUpdate("insert into Sales values('"+invid+"','"+cname+"','"+totquan+"','"+totGR+"')");
            JOptionPane.showMessageDialog(null, "Data Inserted Successfull");      
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (SQLException ex) {
             Logger.getLogger(FPurchase.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
            String id = inid.getText(); 
            conn cn = new conn();
        String sql= "update Sales set InvoiceId='"+id+"'where InvoiceId = '"+id+"'";
        cn.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(this,"Successfully Update"); 
       
              
        } catch (SQLException e) {
            System.out.println(e);
        }
        
       
        // Print or view ireport bill
        
        
//        try {
//            
//           
//        HashMap para = new HashMap();
//        
//        para.put("inv_id", inid.getText());  // inv_id  is ireport parameter name
//        
//        ReportView r =new ReportView("src\\reports\\print.jasper", para);
//        r.setVisible(true);  
//            
//            
//            
//        } catch (Exception e) {
//        }
             reset(); 
    }//GEN-LAST:event_btnPayNPrintActionPerformed

    private void cmbScustProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbScustProdActionPerformed

//          String  pname =cmbScustProd.getSelectedItem().toString();
//           try {
//          conn cn3 = new conn();
//            String Query = ("select pBrand,pCat,pQuantity,pPrice from Stock where pName = '"+pname+"'");
////            String Query = ("select pBrand,pCat,pDesc,pQuantity,pPrice from Stock where pName = '"+pname+"'");
////            String Query = ("select pBrand,pCat from Stock where pName = '"+pname+"'");
//            rs = cn3.st.executeQuery(Query);   
//                if(rs.next()){
//                cmbSProCat.addItem(rs.getString("pCat"));
//                cmbSProCat.getSelectedItem();
//                cmbSPBrand.addItem(rs.getString("BrandName"));
//                cmbSPBrand.getSelectedItem();
//                txtpPrice.setText(rs.getString("pPrice"));
//                txtpQun.setText(rs.getString("pQuantity"));
//          } 
//                ProdTOTCalfun();
//      } catch (SQLException e) {}
    }//GEN-LAST:event_cmbScustProdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      MaiinMenu mm = new MaiinMenu();
        mm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtpPriceInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtpPriceInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpPriceInputMethodTextChanged

    private void txtpPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpPriceActionPerformed

    private void txtpPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpPriceKeyPressed

    private void txtpPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpPriceKeyTyped
        char c = evt.getKeyChar();
        if ((!Character.isDigit(c))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this , "Please enter Price in Numaic value","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtpPrice.getText().length()>=10) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Mamium lengeth is 10","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtpPriceKeyTyped

    private void txtpQunInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtpQunInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpQunInputMethodTextChanged

    private void txtpQunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpQunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpQunActionPerformed

    private void txtpQunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpQunKeyPressed
//        if(txtpQun.getText().trim().isEmpty())
//        {
//            lbltotPrice.setText(null);
//        }
    }//GEN-LAST:event_txtpQunKeyPressed

    private void txtpQunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpQunKeyTyped
        char c = evt.getKeyChar();
        if ((!Character.isDigit(c))) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this , "Please enter Quantity in Numaic value","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtpQun.getText().length()>=10) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Mamium lengeth is 10","Error",JOptionPane.ERROR_MESSAGE);
        }
                

    }//GEN-LAST:event_txtpQunKeyTyped

    private void cmbScustProdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbScustProdItemStateChanged
//          String  pname =cmbScustProd.getSelectedItem().toString();
//          try{
//              CmbProdNameFun();
//          } catch(Exception ew){}
//          try {
//               
//          conn cn3 = new conn();
////            String Query = ("select pBrand,pCat,pDesc,pQuantity,pPrice from Stock where pName = '"+pname+"'");
////            String Query = ("select pBrand,pCat from Stock where pName = '"+pname+"'");
//                String Query = ("select pBrand,pCat,pQuantity,pPrice from Stock where pName = '"+pname+"'");
//                rs = cn3.st.executeQuery(Query);   
//                while(rs.next()){
//                cmbSProCat.addItem(rs.getString("pCat"));
//                cmbSProCat.getSelectedItem();
//                cmbSPBrand.addItem(rs.getString("BrandName"));
//                cmbSPBrand.getSelectedItem();
//                txtpPrice.setText(rs.getString("pPrice"));
//                txtpQun.setText(rs.getString("pQuantity"));
//          }  
//      } catch (SQLException e) {}
//         
    }//GEN-LAST:event_cmbScustProdItemStateChanged

    private void txtpQunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpQunKeyReleased
//       ProdTOTCalfun();
try{
            if (!txtpPrice.getText().isEmpty()&&!txtpQun.getText().isEmpty()) {
                ProdTOTCalfun();
            }else if(txtpQun.getText().isEmpty()){
                lbltotPrice.setText("00.00");
            }else{
                ProdTOTCalfun();
            }
        }catch(Exception ez){}
      
    }//GEN-LAST:event_txtpQunKeyReleased

    private void txtpPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpPriceKeyReleased
        try{
            if (!txtpPrice.getText().isEmpty()&&!txtpQun.getText().isEmpty()) {
                ProdTOTCalfun();
            }else if(txtpPrice.getText().isEmpty()){
                lbltotPrice.setText("00.00");
            }else{
                ProdTOTCalfun();
            }
        }catch(Exception ez){}
    }//GEN-LAST:event_txtpPriceKeyReleased

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
            java.util.logging.Logger.getLogger(FPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FPurchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTOCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPayNPrint;
    private javax.swing.JButton btnReFromCart;
    private javax.swing.JButton btnRemoveall;
    private javax.swing.JComboBox cmbSPBrand;
    private javax.swing.JComboBox cmbSProCat;
    private javax.swing.JComboBox cmbScustName;
    private javax.swing.JComboBox cmbScustProd;
    private javax.swing.JLabel inid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblfName1;
    private javax.swing.JLabel lblfName2;
    private javax.swing.JLabel lbllName10;
    private javax.swing.JLabel lbllName11;
    private javax.swing.JLabel lbllName12;
    private javax.swing.JLabel lbllName13;
    private javax.swing.JLabel lbllName14;
    private javax.swing.JLabel lbllName15;
    private javax.swing.JLabel lbllName16;
    private javax.swing.JLabel lbllName8;
    private javax.swing.JLabel lbllName9;
    private javax.swing.JLabel lbltotGr;
    private javax.swing.JLabel lbltotPrice;
    private javax.swing.JLabel lbltotQuan;
    private javax.swing.JTable tblSalesCart;
    private javax.swing.JTextField txtpPrice;
    private javax.swing.JTextField txtpQun;
    // End of variables declaration//GEN-END:variables
}
