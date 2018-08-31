package com.capgemini.Day3;

public class Employee {
    private int empId;
	private String empName;
	private double hra;
	private double pf;
	private double medical;
	private double netSalary;
	private double basicSalary;
	private double grossSalary;
	
	private static final int PT=200;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, double basicSalary, double medical) {
		this.basicSalary=basicSalary;
		this.medical=medical;
		this.empId=empId;
		this.empName=empName;
	}



	public double netSalaryCalculation() {
		hra=0.5*basicSalary;
		pf=0.12*basicSalary;
		grossSalary=hra+basicSalary+medical;
		netSalary=grossSalary-(pf+PT);
		
		return netSalary;
		
	}
	public void displayEmployeeDetails(int empId, String empName, double netSalary) {
		System.out.println("EmployeeId" +empId+ "EmployeeName" +empName+ "Net Salary" +netSalary);
		
	}

}
