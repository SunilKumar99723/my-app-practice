package com.mycompany.Test;

public class OperatorsTest {
	 public static void main(String[] args) {
		 int tip_percent =15,tax_percent=10;
		 double meal_cost =15.50;
		 
		   double tip = (meal_cost*0.20);
		   
		   System.out.println("tip -- "+tip);
	        double tax = tax_percent*20/100;
	        System.out.println("tax -- "+tax);
	        double total_cost = meal_cost + tip + tax;
	        
	        
	        System.out.println(Math.round(total_cost));
	 }

}
