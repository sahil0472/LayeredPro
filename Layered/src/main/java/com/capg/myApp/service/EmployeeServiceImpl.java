package com.capg.myApp.service;

import java.util.List;

import com.capg.myApp.dao.EmployeeDao;
import com.capg.myApp.dto.Employee;



public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao empDao;
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	public Employee getEmployeeById(int empId) {
		Employee emp = empDao.findEmployeeById(empId);
		return emp;
	}
	
	public List<Employee> getEmployees() {
		System.out.println("Service- In getEmployees");
		List<Employee> empList = empDao.getEmployees();
		return empList;
	}
	
	public List<Employee> getEmployeesByDept() {
		  
		return null;
	}
	
	public void deleteEmployee(int empId) {
		
		
	}

}
