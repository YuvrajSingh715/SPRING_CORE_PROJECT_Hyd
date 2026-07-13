package com.springcore.classtaskD14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService {

	private List<Library> details;

	public LibraryService() {

	}

	public List<Library> getDetails() {
		return details;
	}

	public void setDetails(List<Library> details) {
		this.details = details;
	}

	public Map<String, Integer> getNameAndCode() {
		Map<String, Integer> data = new HashMap<>();
		for (Library value1 : details) {
			data.put(value1.getLibraryName(), value1.getLibraryCode());
		}
		return data;
	}

	public Library getInfo(int libraryCode) {
		Library data = null;
		for (Library value2 : details) {
			if (value2.getLibraryCode() == libraryCode) {
				data = value2;
			}
		}
		return data;
	}

	@Override
	public String toString() {
		return "LibraryService [details=" + details + "]";
	}

}
