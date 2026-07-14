package com.springcore.classtaskD12;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailConfig {

	private Properties configInfo;

	public EmailConfig() {

	}

	public EmailConfig(Properties configInfo) {
		this.configInfo = configInfo;
	}

	public void setConfigInfo(Properties configInfo) {
		this.configInfo = configInfo;
	}

	public Properties getConfigInfo() {
		return configInfo;
	}

	@Override
	public String toString() {
		return "EmailConfig [configInfo=" + configInfo + "]";
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD12/app-context.xml");
		EmailConfig bean = context.getBean("emailConfig", EmailConfig.class);
		System.out.println(bean);

	}

}
