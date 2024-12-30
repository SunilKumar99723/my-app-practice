package com.mycompany.model;

import java.sql.Date;

public class Employee { 

	int emp_id; 
	String emp_FirstName;
	String emp_LastName; 
	String email;
	String phone_Number;
	Date hireDate;
	String jobID;
	int salary;
	int commission_pct;
	int managerID;
	int departmentID;
	String emp_address; 
	
	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_FirstName() {
		return emp_FirstName;
	}


	public void setEmp_FirstName(String emp_FirstName) {
		this.emp_FirstName = emp_FirstName;
	}


	public String getEmp_LastName() {
		return emp_LastName;
	}


	public void setEmp_LastName(String emp_LastName) {
		this.emp_LastName = emp_LastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone_Number() {
		return phone_Number;
	}


	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public String getJobID() {
		return jobID;
	}


	public void setJobID(String jobID) {
		this.jobID = jobID;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getCommission_pct() {
		return commission_pct;
	}


	public void setCommission_pct(int commission_pct) {
		this.commission_pct = commission_pct;
	}


	public int getManagerID() {
		return managerID;
	}


	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}


	public int getDepartmentID() {
		return departmentID;
	}


	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}


	public String getEmp_address() {
		return emp_address;
	}


	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}


	


//	@Overr
	public String toString() 
	{ 
		return "Employee [Employee ID =" + emp_id + ",FIRST NAME=" + emp_FirstName + ", LAST NAME = "+emp_LastName+ ", EMAIL ID - "+email+ 
				", Phone Number = "+phone_Number+ ",Hire Date- "+hireDate+	",Job ID - "+jobID+ ",Salary - "+salary+ ",Commition PCT- " +commission_pct+ 
				",Manager ID - "+managerID+ ",Department ID - "+departmentID+", emp_address=" + emp_address +"]"; 
	} 
} 
