package com.spring.singletonD15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSTByReflectionAPITest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		BreakSTByReflectionAPI ref1 = BreakSTByReflectionAPI.getObject();
		System.out.println("ref1's hashCode: " + ref1.hashCode());

		Constructor<BreakSTByReflectionAPI> con = BreakSTByReflectionAPI.class.getDeclaredConstructor();

		con.setAccessible(true);

		BreakSTByReflectionAPI ref2 = con.newInstance();
		System.out.println("ref2's hashCode: " + ref2.hashCode());
		
	}

}
