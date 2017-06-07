package com.pcf.library;

public class Books {

	private String book_Id;
	private String author;
	private String title;
	private String price;
	private boolean availble_flag;
	
	public Books()
	{
		
	}
	
	public Books(String book_Id, String author, String title, String price, boolean availble_flag) {
		super();
		this.book_Id = book_Id;
		this.author = author;
		this.title = title;
		this.price = price;
		this.availble_flag = availble_flag;
	}
	
	public String getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(String book_Id) {
		this.book_Id = book_Id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public boolean isAvailble_flag() {
		return availble_flag;
	}
	public void setAvailble_flag(boolean availble_flag) {
		this.availble_flag = availble_flag;
	}
	
	public String createDocument()
	{
		return book_Id+"||"+title+"||"+author+"||"+availble_flag+"||"+price;
	}
	
}
