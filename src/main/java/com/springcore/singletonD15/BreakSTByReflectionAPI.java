package com.springcore.singletonD15;

public class BreakSTByReflectionAPI {

	private static BreakSTByReflectionAPI var;

	private BreakSTByReflectionAPI() {

	}

	public static BreakSTByReflectionAPI getObject() {
		if (var == null) {
			var = new BreakSTByReflectionAPI();
		}
		return var;
	}

}
