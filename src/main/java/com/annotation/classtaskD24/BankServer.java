package com.annotation.classtaskD24;

import org.springframework.stereotype.Component;

@Component
public class BankServer {

	public BankServer() {

		System.out.println("💻 Starting the Bank Server");
		System.out.println("🔐 Verifying Security Certificates");
		System.out.println("🗄️ Connecting to the Database");
		System.out.println("🌐 Establishing Network Connection");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Bank Server Setup Done" + System.lineSeparator());
	}

}
