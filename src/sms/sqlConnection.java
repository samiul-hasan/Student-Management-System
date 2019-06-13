/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DCL
 */
public class sqlConnection {
    Connection conn = null;
    public static Connection dbConnector(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Data_Student.sqlite");
            JOptionPane.showMessageDialog(null, "Database Connected");
            return conn;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection error! "+e);
            return null;
        }
    }
    
}
