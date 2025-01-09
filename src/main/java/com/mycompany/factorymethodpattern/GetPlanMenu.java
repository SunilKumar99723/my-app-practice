package com.mycompany.factorymethodpattern;

public class GetPlanMenu {

	public GetPlanMenu() {
		// TODO Auto-generated constructor stub
	}
public Plan getPlan(String planType) {
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
