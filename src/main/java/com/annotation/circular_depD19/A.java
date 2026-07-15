package com.annotation.circular_depD19;

public class A {

	B b;

	public A() {
	}

	public A(B b) {
		System.out.println("A is created");
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}
