package com.kodakandla.rohith;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	@SensitiveData private String ssn;	
	@SensitiveData(value = "XXX-XX-XX") private String dob;	
	private ContactInformation contactInformation;
	
	public User(String name, String ssn, String dob, ContactInformation contactInformation) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dob = dob;
		this.contactInformation = contactInformation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public ContactInformation getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}
	
	
}
