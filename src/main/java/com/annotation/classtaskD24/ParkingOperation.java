package com.annotation.classtaskD24;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/annotation/classtaskD24/applicationP.properties")
public class ParkingOperation {

	@Value("${parking_name}")
	private String parkingName;

	@Value("${vehicle_type}")
	private String vehicleType;

	@Value("${2_wheelerCharge}")
	private int twoWheelerCharge;

	@Value("${4_wheelerCharge}")
	private int fourWheelerCharge;

	@Value("${slot}")
	private int parkingSlot;

	Set<String> vehicles = new HashSet<>();

	public ParkingOperation() {
	}

	public void vehicleEntry(String vehicleNumber) {

		if (parkingSlot == 0) {
			System.err.println("❌ Parking is Full!");
			return;
		}

		if (vehicles.contains(vehicleNumber)) {
			System.err.println("❌ Vehicle is Already Parked!");
			return;
		}

		vehicles.add(vehicleNumber);
		parkingSlot--;

		System.out.println("🚗 Vehicle Entered Successfully");
		System.out.println("Vehicle Number : " + vehicleNumber);
		System.out.println("Available Slots : " + parkingSlot);
	}

	public void vehicleExit(String vehicleNumber) {

		if (vehicles.isEmpty()) {
			System.err.println("❌ No Vehicles are Parked!");
			return;
		}

		if (!vehicles.contains(vehicleNumber)) {
			System.err.println("❌ Vehicle Not Found!");
			return;
		}

		vehicles.remove(vehicleNumber);
		parkingSlot++;

		System.out.println("🚙 Vehicle Exited Successfully");
		System.out.println("Vehicle Number : " + vehicleNumber);
		System.out.println("Available Slots : " + parkingSlot);
	}

	public void availableParkingSlot() {
		System.out.println("Available Parking Slot is " + parkingSlot + System.lineSeparator());
	}

	@Override
	public String toString() {
		return "ParkingOperation [parkingName=" + parkingName + ", vehicleType=" + vehicleType + ", twoWheelerCharge="
				+ twoWheelerCharge + ", fourWheelerCharge=" + fourWheelerCharge + ", parkingSlot=" + parkingSlot + "]";
	}

}
