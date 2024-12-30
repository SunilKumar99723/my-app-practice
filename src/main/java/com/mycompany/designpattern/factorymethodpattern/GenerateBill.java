package com.mycompany.designpattern.factorymethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	
	public static void main(String args[]) throws IOException
	{
		GetPlanMenu gpm = new GetPlanMenu();
		
		System.out.println("Enter the plan for which bill wiil be generated");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // (Enter)Read Plans - Domestic, Commercial, Institute
		String planName= br.readLine();
		
		System.out.println("Enter the number of Units");
		double units= Double.parseDouble(br.readLine());
		
		Plan p = gpm.getPlan(planName);
		 p.getRate(); 
		p.calculateBill(units);
		
	}

}
