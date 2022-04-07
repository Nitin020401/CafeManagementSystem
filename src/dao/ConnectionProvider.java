/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rajput
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    
    }  
    
}
