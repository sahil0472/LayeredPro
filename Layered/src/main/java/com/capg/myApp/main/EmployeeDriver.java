package com.capg.myApp.main;

import java.util.List;

import com.capg.myApp.dao.EmployeeDao;
import com.capg.myApp.dao.EmployeeDaoImpl;
import com.capg.myApp.dto.Employee;
import com.capg.myApp.service.EmployeeService;
import com.capg.myApp.service.EmployeeServiceImpl;



public class EmployeeDriver {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeService employeeService = new EmployeeServiceImpl(employeeDao);
		
		List<Employee> empList = employeeService.getEmployees();
		for(Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
