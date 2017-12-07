/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myconnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Akash
 */
public class myconnection {
    public java.sql.Connection db;
    public myconnection()
    {
        try
        {
            db=DriverManager.getConnection("jdbc:mysql://localhost/clientserver","root","");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
