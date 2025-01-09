package com.mycompany.main;

import com.mycompany.jdbc.dao.EmployeeDaoImplementation;
import com.mycompany.jdbc.model.Employee;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List; 

//import practice.jdbc.dao.EmployeeDaoImplementation;
//import practice.jdbc.model.Employee;

public class Application { 

	public static void main(String[] args) 
		throws SQLException 
	{ 

		Employee emp = new Employee();
		emp.setEmp_id(77);
		emp.setEmp_FirstName("Sunil"); 
		emp.setEmp_LastName("Kumar");
		emp.setEmail("Sunilkumar99723@gmail.com");
		emp.setPhone_Number("9738256695");
		Date date = new Date(0);
		emp.setHireDate(date);
		emp.setJobID("IT_PROG");
		emp.setSalary(10000);
		emp.setCommission_pct((int) 0.2);
		emp.setManagerID(100);
		emp.setDepartmentID(50);
		emp.setEmp_address("India");
		
		EmployeeDaoImplementation empDao= new EmployeeDaoImplementation();

		// add 
//		empDao.add(emp); 

		// read 
//		Employee e = empDao.getEmployee(1); 
//		System.out.println(e.getEmp_id() + " "
//						+ e.getEmp_FirstName() + " "
//						+ e.getEmp_address()); 

		// read All 
		List<Employee> ls = empDao.getEmployees(); 
		for (Employee allEmp : ls) { 
			System.out.println(allEmp); 
		} 

		// update 
//		Employee tempEmployee = empDao.getEmployee(77); 
////		tempEmployee.setEmp_address("Asgard");
//		tempEmployee.setCommission_pct(1);
//		empDao.update(tempEmployee); 
//
//		// delete 
//		empDao.delete(1); 
	} 
} 
