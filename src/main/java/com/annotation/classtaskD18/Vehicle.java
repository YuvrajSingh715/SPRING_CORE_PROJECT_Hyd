package com.annotation.classtaskD18;

@VehicleInfo(brand = "BMW", model = "i7", manufactureYear = 2025)

public class Vehicle {

	public static void main(String[] args) {

		Class<Vehicle> ref = Vehicle.class;

		VehicleInfo info = ref.getAnnotation(VehicleInfo.class);

		System.out.println(info);
		System.out.println("===============================");

		System.out.println("Vehicle Brand: " + info.brand());
		System.out.println("Vehicle Model: " + info.model());
		System.out.println("Vehicle Manufacture Year: " + info.manufactureYear());

	}

}
