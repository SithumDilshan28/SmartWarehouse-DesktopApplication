/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smart_warehouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SHEHARA
 */

public class DataBase {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";//config your password
    private static final String PATH = "jdbc:mysql://localhost:3306/";
    private static final String DBNAME = "smartwarehouse";//config your database name
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    
    public ResultSet dataRead(String query){
        try {
            
            //Class.forName("com.mysql.jdbc.Driver");
             
            connection = DriverManager.getConnection(PATH+DBNAME,USERNAME,PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            System.out.println("");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return resultSet;
    }
    
     public String dataWrite(String query){
        try {
            
            //Class.forName("com.mysql.jdbc.Driver");
             
            connection = DriverManager.getConnection(PATH+DBNAME,USERNAME,PASSWORD);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("");
            return "";
        } catch (SQLException e) {
          return e.toString();
          
        }  
    }
    
}
