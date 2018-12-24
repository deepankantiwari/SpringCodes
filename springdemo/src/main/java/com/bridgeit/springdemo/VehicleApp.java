package com.bridgeit.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Vehicle obj = (Vehicle) context.getBean("vehicle");

		// Vehicle obj = new Car();

		obj.drive();

	}
}
