package com.cg1;

public class Vehicle 
{
	private int regno;
	private String brand;
	private int price;
	private int mileage;
	
	public Vehicle(int regno, String brand, int price, int mileage) {
		this.regno = regno;
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Vehicle [Regno=" + regno + ", brand=" + brand + ", price=" + price + ", mileage=" + mileage + "]";
	}
	
	
	

}
