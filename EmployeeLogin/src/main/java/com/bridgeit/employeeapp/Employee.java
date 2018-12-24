package com.bridgeit.employeeapp;

import javax.validation.constraints.Pattern;

public class Employee {

	private String name;

	@Pattern(regexp = "^[a-zA-Z0-9]{8}", message = "length must be 8")
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
