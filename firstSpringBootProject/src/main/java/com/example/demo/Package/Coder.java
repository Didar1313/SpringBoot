package com.example.demo.Package;

public class Coder {
	private String language;
	private String name;
	private int id;
	private Computer computer;
	private Owner owner;

	public Coder() {
		super();
		System.out.println("No arg constructor(Coder)");
	}

	public Coder(String language, String name, int id, Computer computer,Owner owner) {
		super();
		this.language = language;
		this.name = name;
		this.id = id;
		this.computer = computer;
		this.owner=owner;
		System.out.println("All arg constructor(Coder)");
		
	}
	

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
