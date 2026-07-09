package com.spring.beanlifecycle;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MCClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ClassPathXmlApplicationContext classPath = new ClassPathXmlApplicationContext(
				"com/spring/beanlifecycle/app-context.xml");

		MessageConvertorModel mcm = classPath.getBean("messageConvertorModel", MessageConvertorModel.class);

		System.out.println(mcm);
		
		mcm.destroy();
		
	}

}
