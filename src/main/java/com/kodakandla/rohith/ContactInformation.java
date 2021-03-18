package com.kodakandla.rohith;

import java.io.Serializable;

public class ContactInformation implements Serializable {

	private static final long serialVersionUID = 1L;

    @SensitiveData private String email;
    @SensitiveData private String phone;
	private String zipcode;
	
	public ContactInformation(String email, String phone, String zipcode) {
		super();
		this.email = email;
		this.phone = phone;
		this.zipcode = zipcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
