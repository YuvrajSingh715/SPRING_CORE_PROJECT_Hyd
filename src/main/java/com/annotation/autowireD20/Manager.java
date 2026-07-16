package com.annotation.autowireD20;

public class Manager {

	private String managerName;

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "[Manager-Name=" + managerName + "]";
	}

}
