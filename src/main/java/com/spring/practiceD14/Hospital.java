package com.spring.practiceD14;

import java.util.Set;

public class Hospital {

	private int hospitalCode;
	private String hospitalName;
	private String contectPersonName;
	private long contectPersonNumber;
	private Set<String> treatment;

	private static int uniqueId = 1;

	public Hospital() {
		System.out.println("Hospital class object created");
	}

	public Hospital(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public void init() {
		System.out.println("post construction logic done");
		this.hospitalCode = uniqueId++;
	}

	public int getHospitalCode() {
		return hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public String getContectPersonName() {
		return contectPersonName;
	}

	public long getContectPersonNumber() {
		return contectPersonNumber;
	}

	public Set<String> getTreatment() {
		return treatment;
	}

	public void setHospitalCode(int hospitalCode) {
		System.out.println("Setter Injection done for hospitalCode variable");
		this.hospitalCode = hospitalCode;
	}

	public void setHospitalName(String hospitalName) {
		System.out.println("Setter Injection done for hospitalName variable");
		this.hospitalName = hospitalName;
	}

	public void setContectPersonName(String contectPersonName) {
		System.out.println("Setter Injection done for contectPersonName variable");
		this.contectPersonName = contectPersonName;
	}

	public void setContectPersonNumber(long contectPersonNumber) {
		System.out.println("Setter Injection done for contectPersonNumber variable");
		this.contectPersonNumber = contectPersonNumber;
	}

	public void setTreatment(Set<String> treatment) {
		System.out.println("Setter Injection done for treatment variable");
		this.treatment = treatment;
	}

	@Override
	public String toString() {
		return "Hospital Details [Hospital-Code=" + hospitalCode + ", Hospital-Name=" + hospitalName
				+ ", Contect-PersonName=" + contectPersonName + ", Contect-PersonNumber=" + contectPersonNumber
				+ ", Treatment=" + treatment + "]";
	}

	public void destroy() {
		System.out.println("pre distruction login done");
		this.hospitalCode = 0;
		this.hospitalName = null;
		this.contectPersonName = null;
		this.contectPersonNumber = 0;
		this.treatment = null;
	}
	
}
