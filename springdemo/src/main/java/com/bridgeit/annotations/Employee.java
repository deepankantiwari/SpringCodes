package com.bridgeit.annotations;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	
	
	private Employee employee;

	@Value("${employee.employeeName}")
	private String employeeName;

	private int empId;

	private int salary;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, int empId, int salary) {
		this.employeeName = employeeName;
		this.empId = empId;
		this.salary = salary;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Value("${employee.empId}")
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Value("${employee.salary}")
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void displayEmployeeInfo() {
		System.out.println(" Name " + employeeName + "\n Emp ID " + empId + "\n Salary " + salary);
	}
}
