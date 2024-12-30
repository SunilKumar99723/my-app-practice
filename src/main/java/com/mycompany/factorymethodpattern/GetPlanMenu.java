package com.mycompany.factorymethodpattern;

import practice.designpattern.factorymethodpattern.CommercialPlan;
import practice.designpattern.factorymethodpattern.DomesticPlan;
import practice.designpattern.factorymethodpattern.InstitutePlan;
import practice.designpattern.factorymethodpattern.Plan;

public class GetPlanMenu {

	public GetPlanMenu() {
		// TODO Auto-generated constructor stub
	}
public practice.designpattern.factorymethodpattern.Plan getPlan(String planType) {
	if(planType ==null) {
		return null;
	}
	
	if(planType.equals("Domestic")) {
	return new DomesticPlan();
	}
	if(planType.equals("Commercial")) {
		return new CommercialPlan();
	}
	if(planType.equals("Institute")) {
		return new InstitutePlan();
	}
	
	return null;
	
	
}
}
