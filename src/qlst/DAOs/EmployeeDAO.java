/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlst.DAOs;
import java.sql.*;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import qlst.Utils.ConnectDB;
import qlst.models.Employees;

/**
 *
 * @author Admin
 */
public class EmployeeDAO {
    
    public List<Employees> getAllEmployees(){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        List<Employees> list = new ArrayList<>();
        
        try {
            conn = ConnectDB.getInstance(); // tao ket noi
            //Tao loi nhan
            String sql = "SELECT em.code, em.salary, user.hoTen, user.tel, user.address, user.ngaySinh "
                    + "FROM employees em "
                    + "INNER JOIN users user ON em.userID = user.ID";
            
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            
            while(rs.next()){
                Employees em = new Employees(rs.getString("hoTen"),
                        rs.getString("tel"),
                        rs.getDate("ngaySinh").toLocalDate(),
                        rs.getString("address"),
                        rs.getString("code"),
                        rs.getDouble("salary")
                );
                
                list.add(em);
                
                
                
            }
            ConnectDB.close(conn);
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
}
