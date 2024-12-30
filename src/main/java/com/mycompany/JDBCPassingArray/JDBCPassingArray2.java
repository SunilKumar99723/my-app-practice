package com.mycompany.JDBCPassingArray;



import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oracle.sql.ArrayDescriptor;

class JDBCPassingArray2 {
    public static void main(String arg[]) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "hr");

          
            // Consider this list is already constructed
//            List<String> parameter = new ArrayList<String>();
//            parameter.add("Steven");
//            parameter.add("David");
//            
//            System.out.println(parameter);
            
            String str[] = {"Steven","David"};
            List<String> wordList = Arrays.asList(str);

          		StringBuilder builder = new StringBuilder();

            		for( int i = 0 ; i < wordList.size(); i++ ) {
            		    builder.append("?,");
            		}

            		String placeHolders =  builder.deleteCharAt( builder.length() -1 ).toString();
            		String stmt = "SELECT * FROM employees where  first_name in ("+ placeHolders + ")";
            		PreparedStatement pst = conn.prepareStatement(stmt);
           
           
//            pst.setString(1, parameterStr);
            int i = 1;
            for (String field : wordList) {
            pst.setString(i++, field);
            }
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("Employee ID - "+rs.getInt(1)+" First name - " +rs.getString(2));
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}