package com.mycompany.Test;

public class EmployeeImmutableDemoMain   
	{  
			public static void main(String ar[])  
			{  
				EmployeeImmutableClass e = new EmployeeImmutableClass("ABC123");  
				String s1 = e.getPancardNumber();  
				System.out.println("Pancard Number: " + s1);  
			}  
	}  
