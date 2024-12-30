package com.mycompany.JDBCPassingArray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/*
 *  The metadata means data about data i.e. we can get further information from the data.
 *	If you have to get metadata of a table like total number of column, column name, column type etc. , 
 *	ResultSetMetaData interface is useful because it provides methods to get metadata from the ResultSet object.
 */
public class ResultSetMetaDataInterface {
	public static void main(String[] argrs) {

		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
			  
			PreparedStatement ps=con.prepareStatement("select * from emp");  
			ResultSet rs=ps.executeQuery();  
			
			ResultSetMetaData rsmd=rs.getMetaData();  // The getMetaData() method of ResultSet interface returns the object of ResultSetMetaData. 
			  
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
			  
			con.close();  
			}catch(Exception e){ System.out.println(e);}
		
			}  
		}  