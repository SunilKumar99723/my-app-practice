package com.mycompany.util;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class DatabaseConnection { 

	private static Connection con = null; 

	static
	{ 
//		oracle.jdbc.driver.OracleDriver
//		"jdbc:oracle:thin:@localhost:1521/XEPDB1","hr","hr"
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; 
		String user = "hr"; 
		String pass = "hr"; 
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			con = DriverManager.getConnection(url, user, pass); 
		} 
		catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace(); 
		} 
	} 
	public static Connection getConnection() 
	{ 
		return con; 
	} 
} 
