package com.spring.practiceD14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/practiceD14/context.xml");

		HospitalService bean1 = context.getBean("hospitalService", HospitalService.class);

		System.out.println(bean1.getNameAndCode());

		Hospital bean2 = context.getBean("hospital1", Hospital.class);

		int code = bean2.getHospitalCode();
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("Enter Hospital Code: "); int code1 = sc.nextInt();
		 */

		Hospital details = bean1.getDetail(code);

		if (details != null) {
			System.out.println(details);
		} else {
			System.out.println("No matching found!");
		}

	}

}
