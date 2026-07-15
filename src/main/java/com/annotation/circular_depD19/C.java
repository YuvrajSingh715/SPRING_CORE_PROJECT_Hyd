package com.annotation.circular_depD19;

public class C {

	A a;

	public C() {
	}

	public C(A a) {
		System.out.println("c is created");
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

}
