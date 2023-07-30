package com.example.demo.ConstructorPackage;

public class Computer {
	private String brand;

	public Computer() {
		super();
		System.out.println("No arg in this Computer(setter)");

	}

	public Computer(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
