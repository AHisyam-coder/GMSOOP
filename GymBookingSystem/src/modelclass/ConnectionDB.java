/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hisyam
 */
public class ConnectionDB {

    private String sql;

    public ConnectionDB(String sql) {
        this.sql = sql;
    }

    public PreparedStatement tryConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "");
            
            return myConn.prepareStatement(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null; 
   }

}
