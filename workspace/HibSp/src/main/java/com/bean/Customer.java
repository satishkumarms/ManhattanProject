package com.bean;

public class Customer {
	private String customerId;
	private String customerName ;
	private Long phone;
	private String location ;
	private String emailId ;
	private String password;


	@Override
	public String toString() {
		return "customerId=" + customerId + ", customerName=" + customerName + ", phone=" + phone
				+ ", location=" + location + ", emailId=" + emailId + " " ;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}



}
