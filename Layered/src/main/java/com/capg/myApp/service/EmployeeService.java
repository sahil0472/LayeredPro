package com.capg.myApp.service;

import java.util.List;

import com.capg.myApp.dto.Employee;



public interface EmployeeService {
	public Employee getEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> getEmployeesByDept();
	public void deleteEmployee(int empId);
}
