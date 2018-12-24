package com.bridgeit.springdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressBook {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");

		Person person = context.getBean("person", Person.class);

		person.displayPersonInfo();
	}

}
