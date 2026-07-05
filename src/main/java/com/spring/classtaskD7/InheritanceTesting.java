package com.spring.classtaskD7;

/*

=======================Project Requirment=======================
 
 Team members:
• Developer 1  ->  Responsible for developing the Car class.
• Developer 2  ->  Responsible for developing the Engine class.

Functionat Requirements
=> Car Type
------------>
1 - Automatic Car
2 - Manual Car
3 - Luxury Car

=> Engine Status (Car Mode)
---------------------------->
101 - Engine Started Successfully
102 - Brake Issue Detected
103 - Fuel Indication Detected

*/

abstract class Engine {
	public abstract int EngineStatus(int mode);
}

class DummySuccessEngine extends Engine {

	@Override
	public int EngineStatus(int carType) {
		return 100;
	}

}

class DummyBreakAppliedEngine extends Engine {

	@Override
	public int EngineStatus(int carType) {
		return 200;
	}

}

class DummyFuelIndicationEngine extends Engine {

	@Override
	public int EngineStatus(int carType) {
		return 300;
	}

}

class Car extends DummySuccessEngine {
	int carType;

	// cunstructor
	public Car(int carType) {
		this.carType = carType;
	}

	public void drive() {
		int mode = EngineStatus(carType);

		if (mode == 100) {
			System.out.println("Engine started successfully");
		} else if (mode == 200) {
			System.out.println("Break applied testing");
		} else if (mode == 300) {
			System.out.println("Fuel empty indication testing");
		} else {
			System.out.println("Some other issue happened in testing");
		}
	}
}

public class InheritanceTesting {

	public static void main(String[] args) {

		int automatic = 1;
		int manual = 2;
		int luxury = 3;

//		Engine engine1 = new DummySuccessEngine();
//		Engine engine2 = new DummyBreakAppliedEngine();
//		Engine engine3 = new DummyFuelIndicationEngine();

		Car tesla = new Car(automatic);
		Car mahindra = new Car(manual);
		Car rollsRoyce = new Car(luxury);

		tesla.drive();
		rollsRoyce.drive();
		mahindra.drive();

	}

}
