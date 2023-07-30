package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	public Dog() {
		System.out.println("Dog constructor");
	}
	public void petInfo() {
		System.out.println("She is not for sell");
	}

}
