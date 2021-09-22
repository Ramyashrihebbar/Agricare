/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agricare;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay
 */
public class ConnectionDB {
     static Connection conn=null;
    
    
    public static Connection myconnection()
    {
        
     
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agricare","root","Veenaalur@24");
        }
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    return conn;

}
}
