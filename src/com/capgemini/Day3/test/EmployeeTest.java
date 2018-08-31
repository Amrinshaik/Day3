package com.capgemini.Day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Day3.Employee;

class EmployeeTest {
	Employee employee;

	@BeforeEach
	void setUp() {
		employee = new Employee(1234, "John", 26800.0, 2000);
	}

	@Test
	void testNetSalaryCalculation() {
		assertEquals(38784.0, employee.netSalaryCalculation(),0.04);
	}

	@AfterEach
	void tearDown() {
		employee = null;
	}

}
