package com.reflectionAPI;

public class Student {

	public String name = "Yuvi";
	private int age = 19;

	private Student() {
	}

	private Student(int num) {
	}

	public void study() {
		System.out.println("Studying...");
	}

	private void sleep() {
		System.out.println("Sleeping...");
	}
}
