package com.annotation.practiceD24;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@DependsOn("bankServerSetup")
@PropertySource("classpath:com/annotation/practiceD24/application.properties")
public class BankOperation {

	public BankOperation() {
//		System.out.println("BankOperation is started");
	}

	@Value("${user_name}")
	private String userName;

	@Value("${account_number}")
	private String accountNumber;

	@Value("${balance}")
	private double currentBalance;

	@Value("${bank_name}")
	private String bankName;

	public void deposite(double amount) {
		if (amount > 0) {
			currentBalance = currentBalance + amount;
			System.out.println("\u001B[38;2;218;112;214m" + "Amount deposited successfully 🥳" + "\u001B[0m"
					+ System.lineSeparator());
		} else {
			System.err.println("Enter the valid amout");
		}
	}

	public void withdraw(double amount) {
		if (currentBalance >= amount && amount > 0) {
			currentBalance = currentBalance - amount; // {currentBalance -= amount;}
			System.out.println("\u001B[38;2;218;112;214m" + "Amount withdrawed successfully 🥳" + "\u001B[0m"
					+ System.lineSeparator());
		} else {
			System.err.println("Invalid amount or Insufficient Balance");
		}
	}

	public void showAccountBalance() {
		System.out.println("\u001B[38;2;218;112;214m" + "Current Account Balance is ₹" + currentBalance + "\u001B[0m"
				+ System.lineSeparator());
	}

	@Override
	public String toString() {
		return "BankOperation [userName=" + userName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + ", bankName=" + bankName + "]";
	}

}
