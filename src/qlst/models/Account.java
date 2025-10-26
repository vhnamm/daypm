/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlst.models;

/**
 *
 * @author ADMIN
 */
public class Account {
    private int ID;
    private int userID;
    private String tenDangNhap;
    private String password;
    private String role;
    private boolean active;
    
    //constructor
    public Account(int userID, String tenDangNhap, String password, String role, boolean active){
        this.userID = userID;
        this.tenDangNhap = tenDangNhap;
        this.password = password;
        this.role = role;
        this.active = active;
        
    }
    
    public Account(){}
    
    public Account(String tenDangNhap, String password) {
        this.tenDangNhap = tenDangNhap;
        this.password = password;
    }
    
    
    // getter - setter

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
