package com.spring.setterandconstructorInjections;

public class A01 {
	
	int a = 10;
	
	public A01() {
		System.out.println("A01 class constructor called");
	}

	@Override
	public String toString() {
		return "      [a = " + a + "]";
	}

	
}
