package com.mycompany.InterviewQuestion;

import java.util.Map;
import java.util.TreeMap;

public class Engineer {

	String enggID;
	String enggName;
	int enggSalary;
	
	public Engineer(String enggID, String enggName, int enggSalary) {
	this.enggID = enggID;
	this.enggName = enggName;
	this.enggSalary = enggSalary;
	}
	public String getEnggID() {
		return enggID;
	}
	public void setEnggID(String enggID) {
		this.enggID = enggID;
	}
	public String getEnggName() {
		return enggName;
	}
	public void setEnggName(String enggName) {
		this.enggName = enggName;
	}
	public int getEnggSalery() {
		return enggSalary;
	}
	public void setEnggSalery(int enggSalery) {
		this.enggSalary = enggSalery;
	}
	
	
	@Override
	public String toString() {
		return "Engineer [enggID=" + enggID + ", enggName=" + enggName + ", enggSalary=" + enggSalary + "]";
	}
	


}
