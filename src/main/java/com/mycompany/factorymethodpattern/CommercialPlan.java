package com.mycompany.factorymethodpattern;

import practice.designpattern.factorymethodpattern.Plan;

public class CommercialPlan extends practice.designpattern.factorymethodpattern.Plan {

	public CommercialPlan() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void getRate() {
		rate=8.20;
	}

}
