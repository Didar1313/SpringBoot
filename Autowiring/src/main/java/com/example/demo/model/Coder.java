package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coder {
	@Autowired
	Dog dog;

	public Coder() {
		System.out.println("Coder Constructor");
	}
	public void dogInfo() {
		dog.petInfo();
	}
	
}
