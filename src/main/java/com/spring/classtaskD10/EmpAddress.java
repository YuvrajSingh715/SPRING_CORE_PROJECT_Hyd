package com.spring.classtaskD10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpAddress {

	private String city;
	private int pincode;

	public EmpAddress() {

	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return " {City=" + city + ", Pincode=" + pincode + "}";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not
	public static void main(String[] args) {
		ApplicationContext ad = new ClassPathXmlApplicationContext("com/spring/classtaskD10/application-context.xml");
		EmpAddress ea = ad.getBean("empAdd", EmpAddress.class);
		System.out.println(ea);
	}

}
