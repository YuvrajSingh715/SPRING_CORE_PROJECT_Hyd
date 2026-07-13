package com.spring.singletonD15;

public class BreakSTByThreadTest {

	public static void main(String[] args) {

		/*
		 * Runnable rn = () -> { BreakSTByThread ref1 = BreakSTByThread.getObject();
		 * System.out.println("ref1's hashCode: " + ref1.hashCode()); };
		 * 
		 * BreakSTByThread ref2 = BreakSTByThread.getObject();
		 * 
		 * Thread t = new Thread(rn);
		 * 
		 * t.start();
		 * 
		 * System.out.println("ref2's hashCode: " + ref2.hashCode());
		 */

		Runnable r1 = () -> {
			BreakSTByThread ref1 = BreakSTByThread.getObject();
			System.out.println("ref1: " + ref1.hashCode());
		};

		Thread t1 = new Thread(r1);
		t1.start();

		BreakSTByThread ref2 = BreakSTByThread.getObject();
		System.out.println("ref2: " + ref2.hashCode());

	}

}