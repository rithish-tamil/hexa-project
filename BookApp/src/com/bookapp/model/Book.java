package com.bookapp.model;

public class Book {
	private String title;
	private String authour;
	private String category;
	private int bookId;
	private double price;
	
	public Book(String title, String authour, String category, int bookId, double price) {
		super();
		this.title = title;
		this.authour = authour;
		this.category = category;
		this.bookId = bookId;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Book [title=" + title + ", authour=" + authour + ", category=" + category + ", bookId=" + bookId
				+ ", price=" + price + "]";
	}
	
	
	
	

}
