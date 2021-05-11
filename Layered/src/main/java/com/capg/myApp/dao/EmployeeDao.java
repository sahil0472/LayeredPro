package com.capg.myApp.dao;

import java.util.List;

import com.capg.myApp.dto.Employee;


public interface EmployeeDao {
	public Employee findEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> findEmployeesByDept();
	public void deleteEmployee(Employee empId);
}
