package com.bean;

public class Supplier
{
	private String supplierId;
	private String supplierName ;
	private Long phone;
	private String location ;
	private String emailId ;
	private String password;






	@Override
	public String toString() {
		return "supplierId=" + supplierId + ", supplierName=" + supplierName + ", phone=" + phone
				+ ", location=" + location + ", emailId=" + emailId + "";
	}






	public String getSupplierId() {
		return supplierId;
	}






	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}






	public String getSupplierName() {
		return supplierName;
	}






	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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
