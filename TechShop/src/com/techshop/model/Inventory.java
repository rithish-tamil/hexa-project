package com.techshop.model;

import java.time.LocalDateTime;

public class Inventory {
	private int inventoryId;
	private Products product;
	private int quantityInStock;
	private LocalDateTime lastStockUpdate;
	
	public Inventory() {
		super();
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public LocalDateTime getLastStockUpdate() {
		return lastStockUpdate;
	}

	public void setLastStockUpdate(LocalDateTime lastStockUpdate) {
		this.lastStockUpdate = lastStockUpdate;
	}

	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", product=" + product + ", quantityInStock=" + quantityInStock
				+ ", lastStockUpdate=" + lastStockUpdate + "]";
	}
	
	public void getTheProduct() {
		
	}
	
	public void getTheQuantityInStock() {
		
	}
	
	public int addToInventory(int quantity) {
		return quantity;
	}
	
	public int removeFromInventory(int quantity) {
		return quantity;
	}
	
	public int updateStockQuantity(int quantity) {
		return quantity;
	}
	
	public int isProductAvailable(int quantityToCheck) {
		return quantityToCheck;
	}
	
	public void inventoryValue() {
		
	}
	
	public int listLowStockProducts(int threshold) {
		return threshold;
	}
	
	public void listOutOfStockProducts() {
		
	}
	
	public void listAllProducts() {
		
	}

}
