/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.sql.*;
/**
 *
 * @author amprojects
 */
public class Connect 
{
    private String register_driver="com.mysql.jdbc.Driver";
    private String connection_string="jdbc:mysql://localhost:3306/gst_billing";
    private String username="root";
    private String password="root"; 
    Connection con;
    public Connection getConnection()
    {
        try
        {
            Class.forName(register_driver);
            con=DriverManager.getConnection(connection_string,username,password);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        return con;
    }
}
