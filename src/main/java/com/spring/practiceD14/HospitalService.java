package com.spring.practiceD14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {

	private List<Hospital> data;

	public HospitalService() {

	}

	public List<Hospital> getData() {
		return data;
	}

	public void setData(List<Hospital> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "HospitalService [data=" + data + "]";
	}

	public Map<String, Integer> getNameAndCode() {
		Map<String, Integer> result = new HashMap<>();
		for (Hospital value : data) {
			result.put(value.getHospitalName(), value.getHospitalCode());
		}
		return result;
	}

	public Hospital getDetail(int hospitalCode) {
		Hospital result = null;
		for (Hospital val : data) {
			if (val.getHospitalCode() == hospitalCode) {
				result = val;
			}
		}
		return result;
	}
}
