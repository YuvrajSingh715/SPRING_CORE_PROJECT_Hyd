package com.spring.setterandconstructorInjectionsD9;

public class B01 {
	
	int b = 20;
	
	public B01() {
		System.out.println("B01 class constructor called");
	}
	
	@Override
	public String toString() {
		return "      [b = " + b + "]";
	}

}
