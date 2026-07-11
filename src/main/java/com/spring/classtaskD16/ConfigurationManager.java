package com.spring.classtaskD16;

public class ConfigurationManager {

	private String applicationName;
	private String environment;

	public ConfigurationManager() {

	}

	public String getApplicationName() {
		return applicationName;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public String toString() {
		return "ConfigurationManager {Application-Name=" + applicationName + ", Environment=" + environment + "}";
	}

}
