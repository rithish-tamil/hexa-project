package com.techshop.model;

import java.time.LocalDateTime;

public class Orders {
	private int ordersId;
	private Customers customer;
	private LocalDateTime orderDate;
	private double totalAmount;
	
	public Orders() {
		super();
	}

	public int getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Orders [ordersId=" + ordersId + ", customer=" + customer + ", orderDate=" + orderDate + ", totalAmount="
				+ totalAmount + "]";
	}
	
	public void calculateTotalAmount() {
		
	}
	
	public void getOrderDetails() {
		
	}
	
	public void updateOrderDetails() {
		
	}
	
	public void cancelOrder() {
		
	}
	

}
