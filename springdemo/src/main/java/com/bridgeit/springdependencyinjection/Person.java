package com.bridgeit.springdependencyinjection;

public class Person {

	private String personAddress;
	private String personName;

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void displayPersonInfo() {

		System.out.println(personName + "  " + personAddress);
	}

}
