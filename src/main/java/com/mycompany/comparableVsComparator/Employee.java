package com.mycompany.comparableVsComparator;
// Using Comparable
//Issue :  In comparable there is one issue , you can sort here either salary wise 
//or phoneNumber wise or name wise or empId wise but at a time you can not use all to sort
// for that you need to change the code and compile again and again.
public class Employee implements Comparable<Employee> {

	private String name;
	private String empId;
	private Integer salary;
	private Integer phoneNumber;
	
	// This method will use to compare the Integer objects(phoneNumber) , Here sorting salary wise
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.salary-o.salary;
//	}
	
	// This method will use to compare the String objects (name), Here sorting salary wise
	@Override
	public int compareTo(Employee o) {
		 return this.name.compareTo(o.name);
	}
	
	public Employee(String name, String empId, Integer salary, Integer phoneNumber) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
}
