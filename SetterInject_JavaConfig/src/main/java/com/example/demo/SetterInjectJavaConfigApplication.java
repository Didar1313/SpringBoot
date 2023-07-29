package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import SetterPackage.Coder;

@SpringBootApplication
public class SetterInjectJavaConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SetterInjectJavaConfigApplication.class, args);
		Coder c2=(Coder) context.getBean("coder1");
		System.out.println(c2.getId());
		System.out.println(c2.getComputer().getBrand());
	}

}
