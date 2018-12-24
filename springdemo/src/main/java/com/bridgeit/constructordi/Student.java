package com.bridgeit.constructordi;

public class Student {

	private String studenName;
	private int rollno;

	public Student(String studenName, int rollno) {
		this.studenName = studenName;
		this.rollno = rollno;
	}

	public void displayStudentInfo() {
		System.out.println(rollno + "  " + studenName);
	}

}
