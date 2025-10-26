/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlst.DAOs;

import com.mysql.cj.xdevapi.Result;
import qlst.models.Account;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlst.Utils.ConnectDB;

/**
 *
 * @author ADMIN
 */
public class AccountDAO {
    
    public boolean checkLogin(Account acc){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectDB.getInstance(); // buoc 1
            String sql = "SELECT * FROM accounts WHERE tenDangNhap = ? AND password = ?";
            pre = conn.prepareStatement(sql);
            
            pre.setString(1, acc.getTenDangNhap());
            pre.setString(2, acc.getPassword());
            
            rs = pre.executeQuery();
            
            if(rs.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectDB.close(conn);
                pre.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        return false;
    }
    
    
}
