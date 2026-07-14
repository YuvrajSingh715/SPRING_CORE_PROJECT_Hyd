package com.springcore.singletonD15;

//circumference of a circle is {2*pie*radius}
//area of a circle is {pie*(radius^2)}

public class Circle {

	private static final double pie = 3.14;

	private static Circle cir;

	private Circle() {

	}

	public static Circle getObject() {

		if (cir == null) {
			cir = new Circle();
		}
		return cir;

	}

	public double getArea(int radius) {
		return pie * radius * radius;
	}

	public static void main(String[] args) {

		Circle circle1 = Circle.getObject();
		Circle circle2 = Circle.getObject();
		Circle circle3 = Circle.getObject();
		

		System.out.println("Circle1's hashCode: " + circle1.hashCode()+ " || Area: "+ circle1.getArea(7) + System.lineSeparator());

		System.out.println("Circle2's hashCode: " + circle2.hashCode()+ " || Area: "+ circle1.getArea(8) + System.lineSeparator());

		System.out.println("Circle3's hashCode: " + circle3.hashCode()+ " || Area: "+ circle1.getArea(9));

	}

}
