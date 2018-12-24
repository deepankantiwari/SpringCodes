package com.bridgeit.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");

			Employee employee = context.getBean("employee", Employee.class);

			employee.displayEmployeeInfo();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
