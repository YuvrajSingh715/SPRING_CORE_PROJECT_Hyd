package com.spring.singletonD15;

public class STRectangle {

	private static STRectangle rect;

	private STRectangle() {

	}

	public static STRectangle getObject(int length, int width) {

		if (rect == null) {
			rect = new STRectangle();
		}

		return rect;

	}

	public static void main(String[] args) {

		STRectangle person1 = STRectangle.getObject(12, 25);
		STRectangle person2 = STRectangle.getObject(12, 15);
		STRectangle person3 = STRectangle.getObject(12, 11);

		System.out.println("Person1's hashCode: " + person1.hashCode() + System.lineSeparator());

		System.out.println("Person2's hashCode: " + person2.hashCode() + System.lineSeparator());

		System.out.println("Person3's hashCode: " + person3.hashCode());

	}

}
