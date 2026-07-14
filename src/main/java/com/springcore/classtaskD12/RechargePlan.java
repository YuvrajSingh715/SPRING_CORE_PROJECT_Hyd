package com.springcore.classtaskD12;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RechargePlan {

	private Map<String, Integer> planType;

	public RechargePlan() {

	}

	public RechargePlan(Map<String, Integer> planType) {
		this.planType = planType;
	}

	public void setPlanType(Map<String, Integer> planType) {
		this.planType = planType;
	}

	public Map<String, Integer> getPlanType() {
		return planType;
	}

	@Override
	public String toString() {
		return "RechargePlan [planType=" + planType + "]";
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD12/app-context.xml");
		RechargePlan bean = context.getBean("rechargePlan", RechargePlan.class);
		System.out.println(bean);

	}

}
