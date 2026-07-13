package com.spring.AnnotationD18;

public record Employee(String name, int id, String address) {

//public record Employee(String name, int id, String address) extends Student{

}

/*
 * 1. (Records are immutable) 
 * record class is immutable. Once an object is created, its values cannot be changed. 
 * If a change is needed, a new object has to be created.
 * 
 * 2. (Setter injection is not possible with a record) 
 * Since a record does not have any setter methods, Spring cannot perform setter 
 * injection on it through XML configuration.
 * 
 * 3. (A record cannot extend or reuse another class) 
 * A record class cannot extend any other class. 
 * This means inheritance cannot be used with records.
 */