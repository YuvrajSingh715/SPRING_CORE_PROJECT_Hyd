package com.annotation.classtaskD24;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ParkingMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com/annotation/classtaskD24");

		ParkingOperation po = context.getBean("parkingOperation", ParkingOperation.class);

		System.out.println(po + System.lineSeparator());

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Select Your Choice By Pressing the Number:");
			System.out.println("Press 1 For Vehicle Entry");
			System.out.println("Press 2 For Vehicle Exit");
			System.out.println("Press 3 For Show Available Parking Slot");
			System.out.println("Press 4 For Generate the Parking Report");
			System.out.println("Press 5 From Exit Parking System" + System.lineSeparator());

			System.out.print("Select Number: ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1 -> {
				System.out.println("Enter Your vehicle Number");
				String vn = scan.next();
				po.vehicleEntry(vn);
				System.out.println("Parked vehicle" + po.vehicles + System.lineSeparator());
			}
			case 2 -> {
				System.out.println("Parked vehicle" + po.vehicles);
				System.out.println("Give Your vehicle Number");
				String vn = scan.next();
				po.vehicleExit(vn + System.lineSeparator());
			}
			case 3 -> po.availableParkingSlot();
			case 4 -> {
				ParkingReportGenerater prg = context.getBean("parkingReport", ParkingReportGenerater.class);
				prg.parkingReport();
			}
			case 5 -> {
				System.out.println("Thank you for visiting my parking");
				System.exit(0);
			}
			default -> {
				System.out.println("Please Enter the valid Number");
			}
			}

		}

	}

}
