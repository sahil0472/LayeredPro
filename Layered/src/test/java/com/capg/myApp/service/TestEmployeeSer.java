package com.capg.myApp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.capg.myApp.dao.EmployeeDao;
import com.capg.myApp.dto.Employee;

@RunWith(MockitoJUnitRunner.class)
class TestEmployeeSer {
	static EmployeeService employeeService = null;
	static EmployeeDao mockEmployeeDao = null;
	private static Employee emp1;
	private static Employee emp2;
	
	static void setUpBeforeClass() throws Exception{
		mockEmployeeDao = Mockito.mock(EmployeeDao.class);
		employeeService = new EmployeeServiceImpl(mockEmployeeDao);
		emp1 = new Employee();
		emp1.setEmpNo(1);
		emp1.setEmpName("Ganesh");
		emp1.setHireDate(LocalDate.of(2018, 11, 22));
		emp1.setSalary(8000);
		emp1.setJob("Analyst");
		emp2 = new Employee();
		emp2.setEmpNo(2);
		emp2.setEmpName("Rohit");
		emp2.setHireDate(LocalDate.of(2018, 11, 22));
		emp2.setSalary(800);
		Mockito.when(mockEmployeeDao.getEmployees()).thenReturn(Arrays.asList(emp1, emp2));
		
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception{
	}
	

	void tearDown() throws Exception{
	}
	
	@Test
	void getAllEmployeestest() {
		List allEmployees = (List) employeeService.getEmployees();
		
		assertNotNull(allEmployees);
		assertEquals(2,allEmployees.size());
	}

}
