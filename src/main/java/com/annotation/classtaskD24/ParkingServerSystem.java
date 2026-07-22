package com.annotation.classtaskD24;

import org.springframework.stereotype.Component;

//@Component
public class ParkingServerSystem {

	public ParkingServerSystem() {
		System.out.println("🚧 Activate Parking Gate Sensors");
		System.out.println("📷 Initialize CCTV Cameras");
		System.out.println("💳 Connect Payment Gateway");
		System.out.println("🖥️ Start Vehicle Detection System");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("💯 Parking System Ready" + System.lineSeparator());
	}

}
