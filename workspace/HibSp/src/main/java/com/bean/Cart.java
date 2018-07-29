package com.bean;

public class Cart 

{
	private Long orderId;
	private Long productId;
	private Long qty;
	private String CustomerId;
	private String dateOfPurchase;// cross check data type
	

	@Override
	public String toString() {
		return "orderId=" + orderId + ", productId=" + productId + ", qty=" + qty + ", CustomerId=" + CustomerId
				+ ", dateOfPurchase=" + dateOfPurchase + "";
	}


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public Long getQty() {
		return qty;
	}


	public void setQty(Long qty) {
		this.qty = qty;
	}


	public String getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}


	public String getDateOfPurchase() {
		return dateOfPurchase;
	}


	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}


	

}
