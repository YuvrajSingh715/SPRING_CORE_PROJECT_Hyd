package com.annotation.practiceD24;

import org.springframework.stereotype.Component;

@Component
public class BankServerSetup {

	public BankServerSetup() {
		System.out.println("\u001B[3m" + "\u001B[32m" + "Bank Server Setup Loading..." + "\u001B[0m");
		System.out.println("\u001B[38;2;255;127;80m" + "🚀 Server Started Successfully!!");
		System.out.println("🛡️ Security Verification Completed!!");
		System.out.println("🗄️ Database Connected Successfully!!");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("🎉 All setup is Ready!!" + "\u001B[0m" + System.lineSeparator());
	}

}
