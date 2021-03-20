package ems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepak
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conn {
    
//    public Connection c;
//    public Statement s;
    public Connection cn = null;
    public Statement st = null;
    public String DSN = "jdbc:odbc:EmsDBDSN";
 
    public conn() throws SQLException{
// try{
//     
//    try {
//                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//             } catch (ClassNotFoundException ex) {
//                 Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//             }
//            cn = DriverManager.getConnection(DSN);
//            st = cn.createStatement();
//    }catch(SQLException e){}
try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cn = DriverManager.getConnection("jdbc:odbc:EmsDBDSN");
        } catch (SQLException ex) {
            Logger.getLogger(FUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st=cn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(FUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
