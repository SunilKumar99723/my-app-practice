package com.mycompany.jdbc.util;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

//This is Singleton 
//How to create Singleton design pattern?
//To create the singleton class, we need to have static member of class, private constructor and static factory method.
public class DatabaseConnection { 

	private static Connection con = null; 

	static
	{ 
//		oracle.jdbc.driver.OracleDriver
//		"jdbc:oracle:thin:@localhost:1521/XEPDB1","hr","hr"
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; 
		//jdbc:oracle:thin:@localhost:1521:db
		String user = "hr"; 
		String pass = "hr"; 
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Register the driver class : Java program is loading oracle driver to esteblish database connection.
			con = DriverManager.getConnection(url, user, pass); //Create the connection object
		} 
		catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace(); 
		} 
	} 
	public static Connection getConnection() // static factory method.
	{ 
		return con; 
	} 
} 
