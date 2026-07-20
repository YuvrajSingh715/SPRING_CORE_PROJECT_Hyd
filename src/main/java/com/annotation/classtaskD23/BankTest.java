package com.annotation.classtaskD23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/classtaskD23/context.xml");

		Bank bank = context.getBean("bank", Bank.class);

		System.out.println(bank);

		System.out.println("withdraw details: " + bank.withdraw());
		System.out.println("final updated balance: " + bank.deposite());

	}

}
