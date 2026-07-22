package com.annotation.practiceD24;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BankReportGenerater {

	public BankReportGenerater() {
		System.out.println("\u001B[32m" + "\u001B[3m" + "Wait Your Report is Generating..." + "\u001B[0m");
		System.out.println("\u001B[33m" + "📂 All report formats uploaded successfully!");
		System.out.println("🗄️ All formats converted and stored in the database!");
		System.out.println("✅ All values verified successfully!");
		System.out.println("🌐 All environment checks completed!");
		System.out.println("🎉 Bank Report Generation is Ready!" + "\u001B[0m");

	}

	public void reportGenerated() {
		System.out.println("\u001B[38;2;30;144;255m" + "All customer data is stored!!" + System.lineSeparator());
	}

}
