package com.spring.beanlifecycleD13;

public class MessageConvertorModel {

	MessageConvertor convertor;
	String message;

	public MessageConvertorModel() {
		System.out.println("MessageConvertorModel object created by default method");
	}

	public void convert(String message) {
		String result = convertor.convertTo(message);
		System.out.println(result);
	}

	public MessageConvertor getConvertor() {
		return convertor;
	}

	public void setConvertor(MessageConvertor convertor) {
		System.out.println("setter executed for converter");
		this.convertor = convertor;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Setter executed for message");
		this.message = message;

	}

	public void init() {
		System.out.println("Init method called");
		this.convert(message);
	}

	public void destroy() {
		System.out.println("Destruction method called");
		convertor = null;
		message = null;

		System.out.println("convertor: " + convertor + " || message: " + message);
	}

	@Override
	public String toString() {
		System.out.println("toString method called");
		return "MessageConvertorModel [convertor=" + convertor + " || message=" + message + "]";
	}
	
}
