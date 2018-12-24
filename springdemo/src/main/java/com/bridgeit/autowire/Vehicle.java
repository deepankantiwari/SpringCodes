package com.bridgeit.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");

		Car car = context.getBean("car", Car.class);

		car.startcar();
	}

}
