package com.techshop.model;

public class OrderDetails {
	private int orderDetailId;
	private Orders order;
	private Products product;
	private int quantity;
	
	public OrderDetails() {
		super();
	}

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailId + ", order=" + order + ", quantity=" + quantity + "]";
	}
	
	public void calculateSubTotal() {
		
	}
	
	public void getOrderDetailInfo() {
		
	}
	
	public void updateQuantity() {
		
	}
	
	public void addDiscount() {
		
	}

}
