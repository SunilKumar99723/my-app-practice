package com.mycompany.jdbc.dao;

import com.mycompany.jdbc.model.Employee;

import java.sql.SQLException;
import java.util.List; 

//import practice.jdbc.model.Employee;

public interface EmployeeDao { 

	public int add(Employee emp)
		throws SQLException; 
	public void delete(int id) 
		throws SQLException; 
	public Employee getEmployee(int id) 
		throws SQLException; 
	public List<Employee> getEmployees() 
		throws SQLException; 
	public void update(Employee emp) 
		throws SQLException; 
} 
