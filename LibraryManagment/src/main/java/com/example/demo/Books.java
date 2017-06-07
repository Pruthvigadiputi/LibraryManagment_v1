package com.example.demo;

public class Books {

	
String title;	
String author;
String book_Id;
int price;
boolean available;

public Books(String title, String author, String book_Id, int price, boolean available) {
	super();
	this.title = title;
	this.author = author;
	this.book_Id = book_Id;
	this.price = price;
	this.available = available;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getBook_Id() {
	return book_Id;
}

public void setBook_Id(String book_Id) {
	this.book_Id = book_Id;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public boolean isAvailable() {
	return available;
}

public void setAvailable(boolean available) {
	this.available = available;
}


}
