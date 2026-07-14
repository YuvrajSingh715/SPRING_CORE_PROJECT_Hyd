package com.springcore.singletonD15;

class Application1 {

	public void fetchOject() {
		SingletonDemo sin1 = SingletonDemo.getObject();
		System.out.println("hashCode of Application1: " + sin1.hashCode());
	}

}

class Application2 {

	public void fetchOject() {
		SingletonDemo sin2 = SingletonDemo.getObject();
		System.out.println("hashCode of Application2: " + sin2.hashCode());
	}

}

public class SDMain {

	public static void main(String[] args) {

		Application1 app1 = new Application1();
		Application2 app2 = new Application2();

		app1.fetchOject();
		app2.fetchOject();

	}

}
