package com.spring.singletonD15;

//circumference of a circle is {2*pie*radius}
//area of a circle is {pie*(radius^2)}

public class Circle {

	public static final double pie = 3.14;

	private static Circle cir;

	private Circle() {

	}

	public static Circle getObject(double pie, int radius) {

		if (cir == null) {
			cir = new Circle();
		}
		return cir;

	}

	public static void main(String[] args) {

		Circle circle1 = Circle.getObject(pie, 17);
		Circle circle2 = Circle.getObject(pie, 15);
		Circle circle3 = Circle.getObject(pie, 12);

		System.out.println("Circle1's hashCode: " + circle1.hashCode() + System.lineSeparator());

		System.out.println("Circle2's hashCode: " + circle2.hashCode() + System.lineSeparator());

		System.out.println("Circle3's hashCode: " + circle3.hashCode());

	}

}
