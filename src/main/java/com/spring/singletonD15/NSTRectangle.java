package com.spring.singletonD15;

//Each object holds its own length and width, so separate objects are needed.
//If a class stores data that is unique to every object, then creating multiple objects is necessary and correct.
//Making such a class Singleton would be wrong.

public class NSTRectangle {

	int lenght;
	int width;

	public NSTRectangle(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
	}

	public void getAera() {
		System.out.println(lenght * width);
	}

	public static void main(String[] args) {

		NSTRectangle rec1 = new NSTRectangle(12, 12);
		NSTRectangle rec2 = new NSTRectangle(15, 15);

		System.out.println("hashCode of rec1: " + rec1.hashCode());
		System.out.print("Area of rec1: ");
		rec1.getAera();

		System.out.println("----------------------------");

		System.out.println("hashCode of rec2: " + rec2.hashCode());
		System.out.print("Area of rec2: ");
		rec2.getAera();

	}

}
