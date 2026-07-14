package com.springcore.classtaskD16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * what is singleton?
 *   |- Singleton is a design pattern.
 *   
 * what is design pattern?
 *   |- a design pattern is a solution to a common problem that occurs repeatedly in software development. 
 *      experts observed these common problems and provided the best solution for a particular situation. 
 *      this solution is known as a Design Pattern.
 *      
 * what is the defination of singleton?
 *   |- singleton is a creational design pattern that restrict the creation of object for multiple. 
 *      it provides only one object of the class and provide the global access of this object. so any class of 
 *      the application use this object.
 * 
 * How to use singleton?
 *  |- for using the singleton you have to remeber a few set of rules
 *     |- 1. Make the constructor private
 *           |- it will prevent the creation of object in other class.
 *           |- it ensures that you can only create your class object. 
 *     
 *     |- 2. Make a class type variable private and static
 *           |- it holds a single object of your class.
 *           |- initially set this variable as null.
 *     
 *     |- 3. Create a public static method to get class object
 *           |- this method provides a globle access of singleton object
 *           |- before creating the object it will verify the reference is null or having any object
 *           |- if reference having null value only that time it creates a object
 *           |- if reference having any object then it will return the same object of your class
 *           |- method is public so any class of the project can use this method for getting a object
 *           |- the method is static so we can able to call the this method through the class name
 *            
 * when we create the method as static?
 *  |- through the static key we restric the creation of object and during the calling we don't need
 *     any object we call any method through the class name.
 *     
 * when to create multiple object?
 *  |- we create a multiple object when each object having a different data which is varied object to object.
 *  
 *  when will we use singleton?
 *  |- if there are no any instance variable inside your class that time we can prefer the single.
 *     but if there are instance variable that time avoid the use of singleton
 */

public class CMClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD16/app-context.xml");

		ConfigurationManager bean1 = context.getBean("configurationManager", ConfigurationManager.class);
		ConfigurationManager bean2 = context.getBean("configurationManager", ConfigurationManager.class);

		System.out.println("hashCode of bean1: " + bean1.hashCode());
		System.out.println("hashCode of bean2: " + bean2.hashCode());

		System.out.println("Both references same or not: " + (bean1 == bean2));
		
		System.out.println(bean1);

	}

}
