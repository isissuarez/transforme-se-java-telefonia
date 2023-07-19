/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonia.utils;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class DBConnection {
    private static String url = "jdbc:mysql://localhost:3306/telefonia";
    private static String user = "root";
    private static String password = "";
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
        connection = DriverManager.getConnection(url, user, password);        
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return connection;
    }
}
