package com.annotation.practiceD24;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.practiceD24");

		BankOperation bankOp = context.getBean("bankOperation", BankOperation.class);

//		BankReportGeneration bank = context.getBean("bankReportGeneration", BankReportGeneration.class);
//		BankOperation bankOp1 = context.getBean("bankOperation", BankOperation.class);
//		System.out.println(bankOp.hashCode()+" == " + bankOp1.hashCode());

		System.out.println("\u001B[1m" + bankOp + "\u001B[0m" + System.lineSeparator());
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("\u001B[1m" + "\u001B[4m" + "\u001B[38;2;255;0;127m"
					+ "Select Your Choice By Pressing the Key:" + "\u001B[0m");
			System.out.println("\u001B[38;2;64;224;208m" + "Press [D] For Deposite the Money");
			System.out.println("Press [W] For WithDraw the Money");
			System.out.println("Press [B] For Get Current Balance");
			System.out.println("Press [R] For Generate the Report");
			System.out.println("Press [E] From Exit Bank System" + "\u001B[0m" + System.lineSeparator());

			System.out.print("Select Character: ");
			char choice = Character.toUpperCase(scan.next().charAt(0));

			switch (choice) {
			case 'D':
				System.out.println("\u001B[38;2;255;140;0m" + "Enter the Amount for Deposite" + "\u001B[0m");
				double depositeMoney = scan.nextDouble();
				bankOp.deposite(depositeMoney);
				break;
			case 'W':
				System.out.println("\u001B[38;2;255;140;0m" + "Enter the Amount for WithDraw" + "\u001B[0m");
				double withdrawMoney = scan.nextDouble();
				bankOp.withdraw(withdrawMoney);
				break;
			case 'B':
				bankOp.showAccountBalance();
				break;
			case 'R':
				BankReportGenerater brg = context.getBean("bankReportGenerater", BankReportGenerater.class);
				brg.reportGenerated();
				break;
			case 'E':
				System.out.println(
						"\u001B[38;2;230;230;250m" + "\u001B[1m" + "Thanks for using my application 🙏" + "\u001B[0m");
				System.exit(0);
				break;
			default:
				System.err.println("Please Enter the valid Character" + System.lineSeparator());
			}

		}

	}

}
