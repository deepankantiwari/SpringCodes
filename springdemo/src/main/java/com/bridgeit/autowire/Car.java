package com.bridgeit.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	@Autowired
	private Engine engine1;

	public Car() {
	}

	
	public Car(Engine engine) {
		this.engine1 = engine;
		System.out.println("plug-in the Car keys");
	}

	public void setEngine1(Engine engine) {
		this.engine1 = engine;
		System.out.println("asdasd");
	}

	public void startcar() {
		if (engine1 != null) {
			engine1.generatePower();
		} else
			System.out.println("Engine turned off");
	}

}
