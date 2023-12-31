package com.cg1;

public class Book 
{
	private int bno;
	private String title;
	private String author;
	private int price;
	
	
	public Book() {
	}


	public Book(int bno, String title, String author, int price) {
		this.bno = bno;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void displayDetails()
	{
		System.out.println("Book Number: "+bno);
		System.out.println("Book Title:"+title);
		System.out.println("Book Author: "+author);
		System.out.println("Book Price: "+price);
	}
	
	public void discountedPrice(int discount)
	{
	    int dPrice =price-(price/100)*discount;
		System.out.println("Discounted Price: "+dPrice);
	}
	

}
