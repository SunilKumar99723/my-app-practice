package com.mycompany.Test;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDate {
	public static String method1(java.util.Date date1, java.util.Date date2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		//dates to be compare  
		
		//prints dates  
		System.out.println("Date 1: " + sdf.format(date1));  
		System.out.println("Date 2: " + sdf.format(date2));
		
		if(date1.equals(date2))
			return " Date is equal";
		else
			return "Date is not equal";
	}
	
	
	public static String method2(java.util.Date date3) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		java.util.Date date4 = sdf.parse("2020-06-18"); 
		
		//prints dates  
		System.out.println("Date 3: " + sdf.format(date3));  
		System.out.println("Date 4: " + sdf.format(date4));
		
		if(date3.equals(date4))
			return "Date is equal";
		else
			return "Date is not equal";
	}
	
	public static void main(String[] argrs) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		
		// Testing Method1 where i am passing two date.
		java.util.Date date1 = sdf.parse("2020-07-20");  
		java.util.Date date2 = sdf.parse("2020-07-18"); 
		System.out.println(TestDate.method1(date1, date2)+"\n");
		
		// Now Testing method2, where i am passing only one date.
		java.util.Date date3 = sdf.parse("2020-06-18"); 
		System.out.println(TestDate.method2(date3));
	
	}
}
