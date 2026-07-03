package com.spring.firstdemo_files;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
//		Without IOC container
		 
		System.out.println("----------------------Manually");
		A01 a = new A01();
		System.out.println(a);
		System.out.println("----------------------Manually");
		B01 b = new B01();
		System.out.println(b);
		System.out.println("----------------------IOC Container");
		
		
//		with IOC container
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/config/application-context.xml");
		
		A01 bean1 = ac.getBean("firstClass", A01.class);
		System.out.println(bean1);
		B01 bean2 = ac.getBean("secondClass", B01.class);
		System.out.println(bean2);
		
	}
	
}
