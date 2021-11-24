package com.xworkz.Smartwatch;

public class SmartWatch {

	private String brand;
	private int size;
	private double price;
	private String color;

	public SmartWatch() {
		System.out.println(this.getClass().getName() + "object created");
	}

	public void displayTime() {
		System.out.println("invoked Display Time");
	}

	public void displayMessage() {
		System.out.println("invoked display message ");
	}

	public SmartWatch(String brand, int size, double price, String color) {
		super();

		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
		System.out.println(this.getClass().getName() + "with parameterized constructor");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
