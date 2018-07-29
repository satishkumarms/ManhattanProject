package com.bean;

import org.hibernate.annotations.Entity;

@Entity
public class Person
{
	private String personId;
	private String personName ;
	private Long phone;
	private String location ;
	private String emailId ;
	private String password;

	@Override
	public String toString() {
		return "personId=" + personId + ", personName=" + personName + ", phone=" + phone
				+ ", location=" + location + ", emailId=" + emailId + "";
	}



	public String getpersonId() {
		return personId;
	}

	public void setpersonId(String personId) {
		this.personId = personId;
	}


	public String getpersonName() {
		return personName;
	}


	public void setpersonName(String personName) {
		this.personName = personName;
	}


	public Long getPhone() {
		return phone;
	}



	public void setPhone(Long phone) {
		this.phone = phone;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


}
