package com.mycompany.test2;//package com.denodo.vdp.custom.functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//@CustomElementType(CustomElementType.VDPFUNCTION, name ="CheckDateExistOrNot")
public class TestDateIsPresentOrNot {
//	@CustomExecutor
//	public static boolean checkdateExistONotInTable(@CustomParam(name= String.class)String processDate)
	
	public static boolean checkDateExistOrNotInTable(String ProcessDate) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int countRows = 0;
		boolean flag = false;
		String username = "hr";
		String password = "hr";
		String connectionURL = "jdbc:oracle:thin:@localhost:1521/orclpdb";
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection(connectionURL,username,password);
		StringBuffer sqlQuery = new StringBuffer();
		sqlQuery.append("SELECT count(*) FROM EMPLOYEES WHERE TO_CHAR(HIRE_DATE,'dd-MON-yyyy')=UPPER (?) ");
		
		System.out.println("Query to check if rows exist in EMP ::: " +sqlQuery.toString());
		
		pstmt = connection.prepareStatement(sqlQuery.toString());
		pstmt.setString(1,ProcessDate);
		rs = pstmt.executeQuery();
		if(rs.next())
		{
			countRows = rs.getInt(1);
			if (countRows > 0) {
				flag = true;  //flag true indicates that date exist in EMP table
			}
		}
	}
	
	catch (Exception e )
	{
		System.out.println("Exception occured while fetching the rows from EMP"+ e.getMessage());
	}
	return flag;
}
// @CustomExecutorReturnType
// public boolean executeReturnType(
//String processDate){
//	if(boolean) {
//		return true;
//	}
//	else{return false;}
//}
	
	public static void main(String[] argrs) {
		
		System.out.println("Check HIRE_DATE column date exist(true) or not(false) in EMP table :"
				+ TestDateIsPresentOrNot.checkDateExistOrNotInTable("21-APR-2008"));
		
		

	}
}
