package com.annotation.classtaskD23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//@Repository  
//IOC Container can't find props bean during testing of another files coz they are use 
//annotationconfigApplicatoncontext(it scans only java classes not files) 
public class Bank {

	@Value("#{props.Account_holderName}")
	private String holderName;

	@Value("#{props.Account_number}")
	private long accountNumber;

	@Value("#{props.Current_balance}")
	private double currentBalance;

	@Value("#{props.Withdraw_amount}")
	private double withdrawAmount;

	@Value("#{props.Deposit_amount}")
	private double depositeAmount;

	public double withdraw() {
		if (currentBalance >= withdrawAmount) {
			currentBalance = currentBalance - withdrawAmount;
		} else {
			System.out.println("Insufficient Balance");
		}
		return currentBalance;
	}

	public double deposite() {
		currentBalance = currentBalance + depositeAmount;
		return currentBalance;
	}

	@Override
	public String toString() {
		return "Bank Details [holderName=" + holderName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + ", withdrawAmount=" + withdrawAmount + ", depositeAmount=" + depositeAmount + "]";
	}

}
