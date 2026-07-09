package com.spring.beanlifecycle;

public class PdfMessageConvertor implements MessageConvertor {

	public PdfMessageConvertor() {
	}

	@Override
	public String convertTo(String message) {
		return "<PDF>" + message + "</PDF>";
	}

}