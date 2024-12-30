package com.mycompany.JDBCPassingArray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCStatement {
   public static void main(String args[]) throws SQLException {
      //Registering the Driver
      DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
      //Getting the connection
      String mysqlUrl = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
      Connection con = DriverManager.getConnection(mysqlUrl, "hr", "hr");
      System.out.println("Connection established......");
      
      //Creating the Statement
//      1. Statement : 
//    	  It is used for accessing your database. Statement interface cannot accept parameters and useful when you are using static SQL statements at runtime. 
//    	  If you want to run SQL query only once then this interface is preferred over PreparedStatement. 
      Statement stmt = con.createStatement();

      //Executing the statement
      String createTable = "CREATE TABLE Employee( "
         + "Name VARCHAR(255), "
         + "Salary INT NOT NULL, "
         + "Location VARCHAR(255))";
      boolean bool = stmt.execute(createTable);
     
      System.out.println(bool);
   }
}

