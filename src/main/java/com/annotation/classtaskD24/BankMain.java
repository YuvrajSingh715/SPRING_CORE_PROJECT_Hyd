package com.annotation.classtaskD24;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.classtaskD24");

		BankOperation bo = context.getBean("forAllUser", BankOperation.class);

//		BankOperation bo1 = context.getBean("forAllUser", BankOperation.class);
//		System.out.println(bo.hashCode() + "   " + bo1.hashCode());

		System.out.println(bo + System.lineSeparator());

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Select Your Choice By Pressing the key:");
			System.out.println("Press [D] For Deposite the Money");
			System.out.println("Press [W] For Withdraw the Money");
			System.out.println("Press [B] For Check Account Balance");
			System.out.println("Press [R] For Generate the Report");
			System.out.println("Press [Q] For Exit from Bank System" + System.lineSeparator());

			int num = Character.toUpperCase(scan.next().charAt(0));

			switch (num) {

			case 'D' -> {
				System.out.println("Enter the money for Deposite");
				double depo = scan.nextDouble();
				bo.moneyDeposite(depo);
			}
			case 'W' -> {
				System.out.println("Enter the money for withdraw");
				double with = scan.nextDouble();
				bo.moneyWithdraw(with);
			}
			case 'B' -> bo.showBalance();
			case 'R' -> {
				BankReportGenerater brg = context.getBean("report", BankReportGenerater.class);
				brg.getBankReport();
			}
			case 'Q' -> {
				System.out.println("Thank you for use my bank application");
				System.exit(0);
			}

			default -> System.err.println("Please Enter the valid number");
			}

		}

	}

}
