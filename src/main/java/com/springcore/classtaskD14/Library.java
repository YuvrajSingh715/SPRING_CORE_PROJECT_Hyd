package com.springcore.classtaskD14;

import java.util.List;
import java.util.Set;

public class Library {

	private int libraryCode;
	private String libraryName;
	private String inChargePerson;
	private long contactNumber;
	private Set<String> genres;
	private static int uniqueId = 1;

	public Library() {
		System.out.println("the object has been created");
	}

	public Library(String libraryName) {
		this.libraryName = libraryName;
	}

	public void init() {
		System.out.println("post construction logic has done");
		this.libraryCode = uniqueId++;
	}

	public int getLibraryCode() {
		return libraryCode;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public String getInChargePerson() {
		return inChargePerson;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public Set<String> getGenres() {
		return genres;
	}

	public void setLibraryCode(int libraryCode) {
		System.out.println("setter injection has done for libraryCode ");
		this.libraryCode = libraryCode;
	}

	public void setLibraryName(String libraryName) {
		System.out.println("setter injection has done for libraryName ");
		this.libraryName = libraryName;
	}

	public void setInChargePerson(String inChargePerson) {
		System.out.println("setter injection has done for inChargePerson ");
		this.inChargePerson = inChargePerson;
	}

	public void setContactNumber(long contactNumber) {
		System.out.println("setter injection has done for contactNumber ");
		this.contactNumber = contactNumber;
	}

	public void setGenres(Set<String> genres) {
		System.out.println("setter injection has done for genres ");
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "Library Details [Library-Code=" + libraryCode + ", Library-Name=" + libraryName + ", InCharge-Person="
				+ inChargePerson + ", Contact-Number=" + contactNumber + ", Genres=" + genres + "]";
	}

	public void destroy() {
		System.out.println("pre distructin logic has done");
		this.contactNumber = 0;
		this.inChargePerson = null;
		this.genres = null;
		this.libraryCode = 0;
		this.libraryName = null;
	}

}
