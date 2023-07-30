package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.ConstructorPackage.Coder;

@SpringBootApplication
public class ConstructorInjectJavaConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ConstructorInjectJavaConfigApplication.class, args);
		Coder c1= (Coder) context.getBean("coder1");
		System.out.println(c1.getId());
		System.out.println(c1.getComputer().getBrand());
	}

}
