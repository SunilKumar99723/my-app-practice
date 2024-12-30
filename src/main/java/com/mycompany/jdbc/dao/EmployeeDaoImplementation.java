package com.mycompany.jdbc.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 

import practice.jdbc.model.Employee; 
import practice.jdbc.util.DatabaseConnection; 

public class EmployeeDaoImplementation	implements EmployeeDao { 

	static Connection con = DatabaseConnection.getConnection(); 

	@Override
	public int add(Employee emp) 
		throws SQLException 
	{ 

		String query 
			= "Insert into employees(EMPLOYEE_ID,\r\n"
					+ "FIRST_NAME,\r\n"
					+ "LAST_NAME,\r\n"
					+ "EMAIL,\r\n"
					+ "PHONE_NUMBER,\r\n"
					+ "HIRE_DATE,\r\n"
					+ "JOB_ID,\r\n"
					+ "SALARY,\r\n"
					+ "COMMISSION_PCT,\r\n"
					+ "MANAGER_ID,\r\n"
					+ "DEPARTMENT_ID,\r\n"
					+ "ADDRESS) values (?,?,?,?,?,?,?,?,?,?,?,?)"; 
		PreparedStatement ps 
			= con.prepareStatement(query); 
		ps.setInt(1,emp.getEmp_id());
		ps.setString(2, emp.getEmp_FirstName()); 
		ps.setString(3, emp.getEmp_LastName());
		ps.setString(4,emp.getEmail());
		ps.setString(5, emp.getPhone_Number());
		ps.setDate(6, emp.getHireDate());
		ps.setString(7, emp.getJobID());
		ps.setInt(8, emp.getSalary());
		ps.setInt(9, emp.getCommission_pct());
		ps.setInt(10, emp.getManagerID());
		ps.setInt(11, emp.getDepartmentID());
		ps.setString(12, emp.getEmp_address());
		int n = ps.executeUpdate(); 
		return n; 
	} 

	@Override
	public void delete(int id) 
		throws SQLException 
	{ 
		String query 
			= "delete from employee where emp_id =?"; 
		PreparedStatement ps 
			= con.prepareStatement(query); 
		ps.setInt(1, id); 
		ps.executeUpdate(); 
	} 

	@Override
	public Employee getEmployee(int id) 
		throws SQLException 
	{ 

		String query 
			= "select * from employees where EMPLOYEE_ID= ?"; 
		PreparedStatement ps 
			= con.prepareStatement(query); 

		ps.setInt(1, id); 
		Employee emp = new Employee(); 
		ResultSet rs = ps.executeQuery(); 
		boolean check = false; 

		while (rs.next()) { 
			check = true; 
			emp.setEmp_id(rs.getInt("EMPLOYEE_ID")); 
//			emp.setEmp_FirstName(rs.getString("FIRST_NAME")); 
//			emp.setEmp_LastName(rs.getString("LAST_NAME"));
//			emp.setEmail(rs.getString("EMAIL"));
//			emp.setPhone_Number(rs.getString("PHONE_NUMBER"));
//			emp.setHireDate(rs.getDate("HIRE_DATE"));
//			emp.setJobID(rs.getString("JOB_ID"));
//			emp.setSalary(rs.getInt("SALARY"));
			emp.setCommission_pct(rs.getInt("COMMISSION_PCT"));
//			emp.setManagerID(rs.getInt("MANAGER_ID"));
//			emp.setDepartmentID(rs.getInt("DEPARTMENT_ID"));			
//			emp.setEmp_address(rs.getString("ADDRESS")); 
		} 

		if (check == true) { 
			return emp; 
		} 
		else
			return null; 
	} 

	@Override
	public List<Employee> getEmployees() 
		throws SQLException 
	{ 
		String query = "select * from employees"; 
		PreparedStatement ps = con.prepareStatement(query); 
		ResultSet rs = ps.executeQuery(); 
		List<Employee> ls = new ArrayList<Employee>(); 

		while (rs.next()) { 
			Employee emp = new Employee(); 
			emp.setEmp_id(rs.getInt("EMPLOYEE_ID")); 
			emp.setEmp_FirstName(rs.getString("FIRST_NAME")); 
			emp.setEmp_LastName(rs.getString("LAST_NAME"));
			emp.setEmail(rs.getString("EMAIL"));
			emp.setPhone_Number(rs.getString("PHONE_NUMBER"));
			emp.setHireDate(rs.getDate("HIRE_DATE"));
			emp.setJobID(rs.getString("JOB_ID"));
			emp.setSalary(rs.getInt("SALARY"));
			emp.setCommission_pct(rs.getInt("COMMISSION_PCT"));
			emp.setManagerID(rs.getInt("MANAGER_ID"));
			emp.setDepartmentID(rs.getInt("DEPARTMENT_ID"));			
			emp.setEmp_address(rs.getString("ADDRESS"));
			ls.add(emp); 
		} 
		return ls; 
	} 

	@Override
	public void update(Employee emp) 
		throws SQLException 
	{ 

		String query 
			= "update employees set COMMISSION_PCT=?, "
			+ " where emp_id = ?"; 
		PreparedStatement ps 
			= con.prepareStatement(query); 
		ps.setInt(1, emp.getCommission_pct()); 
//		ps.setString(2, emp.getEmp_address()); 
		ps.setInt(2, emp.getEmp_id()); 
		ps.executeUpdate(); 
	} 
} 
