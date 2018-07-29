package com.bean;

public class Product 
{
	private Long productId;
	private String productName;
	private String category;
	private String description;
	
	

	@Override
	public String toString() {
		return "productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", description=" + description + "";
	}



	



	public Long getProductId() {
		return productId;
	}



	public void setProductId(Long productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

}
