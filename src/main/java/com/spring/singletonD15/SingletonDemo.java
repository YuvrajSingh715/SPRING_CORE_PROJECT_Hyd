package com.spring.singletonD15;

public class SingletonDemo {

//	 Rule: a private static reference holds the one and only instance of the class
	private static SingletonDemo single;

//	Rule: private constructor blocks object creation from outside the class
	private SingletonDemo() {

	}
	
//	Rule: public static method controls object creation and access
	public static SingletonDemo getObject() {
		//Create the object only if it does not already exist
		if (single == null) {
			single = new SingletonDemo();
		}
		return single;
	}

}
