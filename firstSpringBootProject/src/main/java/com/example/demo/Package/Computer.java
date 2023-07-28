package com.example.demo.Package;

public class Computer {
	private String brand;

	public Computer() {
		super();
		System.out.println("No arg constructor(Computer)");
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
		System.out.println("All arg constructor(Computer)");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
