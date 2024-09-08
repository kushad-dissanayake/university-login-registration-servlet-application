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
public class ConnectionCourse {
    
     private static Connection con1;
    
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3309/course_db", "root", "root");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return con1;
    }
    
}
