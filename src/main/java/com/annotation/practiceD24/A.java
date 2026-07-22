package com.annotation.practiceD24;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Component
@Lazy
@DependsOn("b")
public class A {

	public A() {
		System.out.println("A class object");
	}

}
