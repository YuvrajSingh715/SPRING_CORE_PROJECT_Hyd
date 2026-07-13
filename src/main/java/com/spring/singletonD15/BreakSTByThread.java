package com.spring.singletonD15;

public class BreakSTByThread {

	private static BreakSTByThread var;

	private BreakSTByThread() {

	}

	public static BreakSTByThread getObject() {
		if (var == null) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			var = new BreakSTByThread();
		}
		return var;
	}

}
