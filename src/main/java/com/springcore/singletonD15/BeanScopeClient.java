package com.springcore.singletonD15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * there is for type of scope is available
 * 1. singleton
 * 2. prototype
 * 
 * 3. request-------\
 *                   ----> works with web application 
 * 4. session-------/
 * 
*/
public class BeanScopeClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/singletonD15/app-context.xml");

		BeanScope bean1 = context.getBean("beanScope", BeanScope.class);
		BeanScope bean2 = context.getBean("beanScope", BeanScope.class);
		BeanScope bean3 = context.getBean("beanScope", BeanScope.class);

		System.out.println("hashCode of bean1: " + bean1.hashCode() + System.lineSeparator());
		System.out.println("hashCode of bean2: " + bean2.hashCode() + System.lineSeparator());
		System.out.println("hashCode of bean3: " + bean3.hashCode());

	}

}
