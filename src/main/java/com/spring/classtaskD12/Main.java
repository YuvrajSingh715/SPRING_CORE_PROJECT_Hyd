package com.spring.classtaskD12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/classtaskD12/app-context.xml");

		System.out.println("IssuedBook Class Data");
		System.out.println("======================");
		IssuedBook bean1 = context.getBean("issuedBook", IssuedBook.class);
		System.out.println(bean1 + System.lineSeparator());

		System.out.println("Members Class Data");
		System.out.println("===================");
		Members bean2 = context.getBean("members", Members.class);
		System.out.println(bean2 + System.lineSeparator());

		System.out.println("BookInventory Class Data");
		System.out.println("=========================");
		BookInventory bean3 = context.getBean("bookInventory", BookInventory.class);
		System.out.println(bean3 + System.lineSeparator());

		System.out.println("Library Class Data");
		System.out.println("===================");
		Library bean4 = context.getBean("library", Library.class);
		System.out.println(bean4);

	}

}
