package com.example.demo.Package;

public class Owner {
	private String owner;

	public Owner() {
		super();
		System.out.println("NO arg in this constructor(Owner)");
	}
	

	public Owner(String owner) {
		super();
		this.owner = owner;
	}


	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
