/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlst.models;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Employees extends User{
    private int ID;
    private int userID;
    private String codes;
    private double salary;

    public Employees( String name, String tel, LocalDate dob, String address, String codes, double salary) {
        super( name, tel, dob, address);
        this.codes = codes;
        this.salary = salary;
        
    }

    

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

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
