/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ksanj
 */
public class ConnectionPro {
    
    private static Connection con;
    
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3309/jsp_project", "root", "root");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return con;
    }
    
}
