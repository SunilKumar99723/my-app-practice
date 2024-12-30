package com.mycompany.JDBCPassingArray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*

Statement													PreparedStatement
It is used when SQL query is to be executed only once.   |	It is used when SQL query is to be executed multiple times.
You can not pass parameters at runtime.				     |	You can pass parameters at runtime.
Used for CREATE, ALTER, DROP statements.				 |	Used for the queries which are to be executed multiple times. It is used to execute parameterized query. 
															Example of parameterized query: String sql="insert into emp values(?,?,?)";  
Performance is very low.								 |	Performance is better than Statement.
It is base interface.	  								 |  It extends statement interface.
Used to execute normal SQL queries.					     |	Used to execute dynamic SQL queries.
We can not used statement for reading binary data.	     |	We can used Preparedstatement for reading binary data.
It is used for DDL statements.						     |	It is used for any SQL Query.
We can not used statement for writing binary data.	     |	We can used Preparedstatement for writing binary data.
No binary protocol is used for communication.			 |	Binary protocol is used for communication.

*/
public class JDBCStatementVsPreparedStatement {
	public static void main(String[] argrs) {

		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
			
			 Statement stmt = con.createStatement();

		      //Executing the statement
		      String createTable = "CREATE TABLE Emp( "
		         + "ID NUMBER, "
		         + "NAME VARCHAR(255))";
		      boolean bool = stmt.execute(createTable);

		      System.out.println("Successfully executed - "+bool);
		      
		      
			PreparedStatement prstmt=con.prepareStatement("insert into Emp values(?,?)");  
			prstmt.setInt(1,101);//1 specifies the first parameter in the query  
			prstmt.setString(2,"Ratan");  
			  
			int i=prstmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  
			}  