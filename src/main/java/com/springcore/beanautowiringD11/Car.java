package com.springcore.beanautowiringD11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {

	private String carName;
	private Engine engine;
	private Transmission transmission;

	public Car() {
		System.out.println("0 param constructor {default constructor}");
	}
	
	public Car(String carName) {
		System.out.println("1 param constructor {carName}");
		this.carName = carName;
	}

	public Car(Engine engine) {
		System.out.println("1 param constructor {engine}");
		this.engine = engine;
	}
	
	public Car(Transmission transmission) {
		System.out.println("1 param constructor {transmission}");
		this.transmission = transmission;
	}

	public Car(Engine engine, Transmission transmission) {
		System.out.println("2 param constructor {engine, transmission}");
		this.transmission = transmission;
		this.engine = engine;
	}

	public Car(String carName, Engine engine, Transmission transmission) {
		System.out.println("3 param constructor {carName, engine, transmission}");
		this.carName = carName;
		this.engine = engine;
		this.transmission = transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car Details [Car-Name=" + carName + ", " + engine + ", " + transmission + "]";
	}

	// just for verification purpose like values are injected or not
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/beanautowiringD11/autowiring.xml");
		Car c = con.getBean("car", Car.class);
		System.out.println(c);

	}

}
