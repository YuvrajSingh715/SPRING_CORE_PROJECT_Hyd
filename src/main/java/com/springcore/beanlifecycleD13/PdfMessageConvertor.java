package com.springcore.beanlifecycleD13;

public class PdfMessageConvertor implements MessageConvertor {

	public PdfMessageConvertor() {
	}

	@Override
	public String convertTo(String message) {
		return "<PDF>" + message + "</PDF>";
	}

}