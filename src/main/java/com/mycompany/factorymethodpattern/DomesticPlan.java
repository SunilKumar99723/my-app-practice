package com.mycompany.factorymethodpattern;

import practice.designpattern.factorymethodpattern.Plan;

public class DomesticPlan extends practice.designpattern.factorymethodpattern.Plan {

	public DomesticPlan() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void getRate() {
		rate = 4.50;
		
	}

}
