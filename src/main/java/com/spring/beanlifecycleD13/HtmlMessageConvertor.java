package com.spring.beanlifecycleD13;

public class HtmlMessageConvertor implements MessageConvertor {

	public HtmlMessageConvertor() {
	}

	@Override
	public String convertTo(String message) {
		return "<HTML>" + message + "</HTML>";
	}

}
