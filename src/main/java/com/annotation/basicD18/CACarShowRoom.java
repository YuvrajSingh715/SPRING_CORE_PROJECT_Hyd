package com.annotation.basicD18;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Custom Annotation

@Retention(RetentionPolicy.RUNTIME)
public @interface CACarShowRoom {
	
	String brandName();
	int gear();
	String carModel();

}
