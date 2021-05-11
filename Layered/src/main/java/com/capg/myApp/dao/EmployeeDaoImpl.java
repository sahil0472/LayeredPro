package com.capg.myApp.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.capg.myApp.dto.Employee;



public class EmployeeDaoImpl implements EmployeeDao{
	List<Employee> empList = new ArrayList<Employee>();
	public Employee findEmployeeById(int empId) {
		
		return null;
	}

	public List<Employee> getEmployees() {
		System.out.println("In EmployeeDeo");
		Employee employee  = new Employee();
		employee.setEmpNo(12345);
		employee.setEmpName("Ganesh");
		employee.setHireDate(LocalDate.of(2018, 11, 22));
		employee.setSalary(8700);
		employee.setJob("Analyst");
		employee.setDeptName("L&D");
		empList.add(employee);
		
		employee = new Employee();
		employee.setEmpNo(12546);
		employee.setEmpName("Anay");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(10000);
		employee.setJob("Analyst");
		employee.setDeptName("R&D");
		empList.add(employee);
		
		employee = new Employee();
		employee.setEmpNo(14785);
		employee.setEmpName("Suresh");
		employee.setHireDate(LocalDate.of(2010, 07, 20));
		employee.setSalary(20000);
		employee.setJob("Analyst");
		employee.setDeptName("Training");
		empList.add(employee);
		
		employee = new Employee();
		employee.setEmpNo(17584);
		employee.setEmpName("Ramesh");
		employee.setHireDate(LocalDate.of(2021, 04, 10));
		employee.setSalary(56000);
		employee.setJob("Analyst");
		employee.setDeptName("Empulse");
		empList.add(employee);
		return empList;
	}

	public List<Employee> findEmployeesByDept() {
		
		return null;
	}

	public void deleteEmployee(Employee empId) {
		
	}

}
