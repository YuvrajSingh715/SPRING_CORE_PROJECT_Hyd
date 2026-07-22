package com.annotation.classtaskD24;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("report")
@Lazy
public class BankReportGenerater {

	public BankReportGenerater() {
		System.out.println("Wait your bank report is generating...");
		System.out.println("all report formate uploaded successfully");
		System.out.println("all formate converted and stored in database");
		System.out.println("all value verified successfully");
		System.out.println("all environment checks completed");
		System.out.println("report generation process completed");
	}

	public void getBankReport() {
		System.out.println("Your report is ready!!" +System.lineSeparator());
	}

}
