package com.springcore.beanautowiringD11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Transmission(Gearbox)
public class Transmission {

	private String transmissionType;
	private int gear;

	public Transmission() {

	}

	public Transmission(String transmissionType, int gear) {
		this.transmissionType = transmissionType;
		this.gear = gear;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "Transmission Details {Transmission-Type=" + transmissionType + ", Gear=" + gear + "}";
	}

	// just for verification purpose like values are injected or not
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanautowiringD11/autowiring.xml");
		Transmission trans = context.getBean("transmission", Transmission.class);
		System.out.println(trans);
	
	}

}
