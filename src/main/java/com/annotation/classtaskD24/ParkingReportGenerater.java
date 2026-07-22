package com.annotation.classtaskD24;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("parkingReport")
@Lazy
public class ParkingReportGenerater {

	public ParkingReportGenerater() {
		System.out.println("Reads thousands of parking records");
		System.out.println("Calculates total revenue");
		System.out.println("Generates PDF reports");
		System.out.println("Stores reports in the database");
	}

	public void parkingReport() {
		System.out.println("Report generated Successfully" + System.lineSeparator());
	}
}
