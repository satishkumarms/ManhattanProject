package com.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

@Id
//@GeneratedValue //assigned
private String isbn;

private String title;
private double price;
private long stock;
private String author;

//private Date date;

@Override
public String toString() {
	return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price
			+ ", stock=" + stock + ", author=" + author + "]";
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
/*public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}*/
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public long getStock() {
	return stock;
}
public void setStock(long stock) {
	this.stock = stock;
}


}
