package com.annotation.classtaskD24;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("forAllUser")
@DependsOn("bankServer")
@Scope("prototype")
@PropertySource("classpath:com/annotation/classtaskD24/applicationB.properties")
public class BankOperation {

	@Value("${user_name}")
	private String userName;

	@Value("${account_number}")
	private long accountNumber;

	@Value("${balance}")
	private double balance;

	@Value("${bank_name}")
	private String bankName;

	public void moneyWithdraw(double amount) {
		if (balance >= amount && amount > 0) {
			balance -= amount;
			System.out.println("Money withdrawed successfully!!");
		} else {
			System.err.println("Invalid amount or Insufficent amount");
		}
	}

	public void moneyDeposite(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Money deposited successfully!!");
		} else {
			System.err.println("Enter the valid amount");
		}
	}

	public void showBalance() {
		System.out.println("Current Available Balance is ₹" + balance +System.lineSeparator());
	}

	@Override
	public String toString() {
		return "BankOperation [userName=" + userName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", bankName=" + bankName + "]";
	}

}
