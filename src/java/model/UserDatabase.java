/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dbo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ksanj
 */
public class UserDatabase {
    
    Connection con;
    
    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    public boolean saveUser(User user) {
        boolean set = false;
        try {
            String query = "insert into user(name,email,password) values(?,?,?)";
            
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, user.getName());
            pt.setString(2, user.getEmail());
            pt.setString(3, user.getPassword());
            
            pt.executeUpdate();
            set = true;     
        }catch(Exception e) {
            e.printStackTrace();
        }
        return set;
        
    }
    
}
