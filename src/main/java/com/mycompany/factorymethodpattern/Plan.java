package com.mycompany.factorymethodpattern;

 abstract class Plan {

	public Plan() {
		// TODO Auto-generated constructor stub
	}
	double rate;
	abstract void getRate();
	void calculateBill(double units) {
		double bill=units*rate;
		System.out.println(bill);
	}

}
