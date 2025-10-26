/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlst.Utils;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ConnectDB {
    private static String url = "jdbc:mySQL://localhost:3306/qlst2";
    private static String username = "root";
    private static String pass = "vohoainam10012005";
    private static Connection conn = null;
    
    public static Connection getInstance(){
        try {
            conn = DriverManager.getConnection(url, username, pass);
            return conn;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return conn;
    }
    
    public static void close(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
