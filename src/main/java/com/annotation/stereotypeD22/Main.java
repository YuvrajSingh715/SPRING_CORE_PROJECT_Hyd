package com.annotation.stereotypeD22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.stereotypeD22");

		Restaurant bean1 = context.getBean("hotel", Restaurant.class);
//		Restaurant bean2 = context.getBean("hotel", Restaurant.class);

//		System.out.println("hashCode of bean1: " + bean1.hashCode());
//		System.out.println("hashCode of bean2: " + bean2.hashCode());
//		System.out.println("Are hashCode of beans same or not: " + (bean1 == bean2));
		
//		System.out.println(System.lineSeparator());
		System.out.println(bean1);

	}

}
