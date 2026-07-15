package com.annotation.circular_depD19;

public class B {
	
	C c;
	
	public B() {
	}

	public B(C c) {
		System.out.println("B is created");
		this.c = c;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
	
	

}
