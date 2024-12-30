package com.mycompany.designpattern.factorymethodpattern;

 public abstract class Plan {

	double rate;
	public abstract void getRate(); // Only this need to define in child class 
	public void calculateBill(double units) {
		double bill=units*rate;
		System.out.println(bill);
	}

}
