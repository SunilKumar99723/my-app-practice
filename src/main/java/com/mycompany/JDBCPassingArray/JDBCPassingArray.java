package com.mycompany.JDBCPassingArray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import oracle.sql.ArrayDescriptor;

class JDBCPassingArray {
    public static void main(String arg[]) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "hr");
//            PreparedStatement : It is used when you want to use SQL statements many times. The PreparedStatement interface accepts input parameters at runtime
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM employees where  first_name in(?)"); 
            String[] Parameter = { "Steven", "David" };
            ArrayDescriptor arrayDescriptor = ArrayDescriptor.createDescriptor("EMPLOYEE_DTL", conn);
            java.sql.Array sqlArray = new oracle.sql.ARRAY(arrayDescriptor, conn, Parameter); 
//            System.out.println(sqlArray);
            pst.setArray(1, sqlArray);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("Employee ID - "+rs.getInt(1)+" First name - " +rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}