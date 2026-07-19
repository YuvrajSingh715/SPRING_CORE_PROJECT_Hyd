package com.reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * Common Reflection Methods
   -------------------------
   
               Method                                     Purpose
            ------------       						   -----------   
            
	        getClass()			   					 Get the Class object
            Class.forName()							 Load a class by its name
            getName()								 Get class name
			getMethods()	 							 Get public methods (including inherited ones)
            getDeclaredMethods()	                     Get all methods declared in the class
            getFields()	                   		     Get public fields
            getDeclaredFields()	                     Get all fields declared in the class
            getConstructors()	                     Get public constructors
            getDeclaredConstructors()	             Get all constructors declared in the class
            getDeclaredMethod("name")	             Get a specific method
            getDeclaredField("name")	                 Get a specific field
            invoke()                                  Call a method dynamically
            newInstance()	                         Create an object
            setAccessible(true)	                     Access private members
            set()	                                 Change a field value
            get()	                                 Read a field value 
            
 */

public class Main {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException,
			InvocationTargetException, InstantiationException, IllegalArgumentException, NoSuchFieldException {

		// Get class object
		Class<?> c1 = Student.class;
		Class<?> c2 = Class.forName("com.reflectionAPI.Student");
		System.out.println("c1: " + c1.hashCode());
		System.out.println("c2: " + c2.hashCode() + System.lineSeparator());

		// Get class name
		Class<?> c3 = Student.class;
		System.out.println(c3.getName() + System.lineSeparator());

		// Get Constructors
		Constructor<?>[] cons1 = c3.getConstructors();
		for (Constructor<?> con : cons1) {
			System.out.println(con + System.lineSeparator());
		}

		// Get own Constructors
		Constructor<?>[] cons2 = c3.getDeclaredConstructors();
		for (Constructor<?> con : cons2) {
			System.out.println(con);
		}
		System.out.print(" " + System.lineSeparator());

		// Get Methods (getMethods return all the parent class methods also)
		Method[] method1 = c3.getMethods();
		for (Method met : method1) {
			System.out.println(met);
		}
		System.out.print(" " + System.lineSeparator());

		// Get own methods (getDeclaredMethods return only developer written methods)
		Method[] method2 = c3.getDeclaredMethods();
		for (Method met : method2) {
			System.out.println(met);
		}
		System.out.print("" + System.lineSeparator());

		// Get Fields
		Field[] field = c3.getDeclaredFields();
		for (Field fi : field) {
			System.out.println(fi);
		}
		System.out.print("" + System.lineSeparator());

		// Call a Method Using Reflection
		// -------------------------------
		Class<?> stu = Student.class;

		// Get the private constructor
		Constructor<?> constructor = c1.getDeclaredConstructor();

		// Allow access to the private constructor
		constructor.setAccessible(true);

		// Create the object
		Object student = constructor.newInstance();

		// Invoke the method
		Method pub = stu.getDeclaredMethod("study"); // public method
		Method pri = stu.getDeclaredMethod("sleep"); // private method
		pri.setAccessible(true);

		pub.invoke(student);
		pri.invoke(student);
		System.out.print("" + System.lineSeparator());

		// Access Private Variable
		Field pub1 = stu.getDeclaredField("name"); // public field
		Field pri1 = stu.getDeclaredField("age"); // private field
		pri1.setAccessible(true);

		System.out.println(pub1.get(student));
		System.out.println(pri1.get(student));
		System.out.print("" + System.lineSeparator());

		// change the Variable
		pub1.set(student, "Yuvraj"); // public field
		System.out.println(pub1.get(student));

		pri1.set(student, 20); // private field
		System.out.println(pri1.get(student));

	}

}
