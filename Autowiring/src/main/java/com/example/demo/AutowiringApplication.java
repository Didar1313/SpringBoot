package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Coder;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowiringApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AutowiringApplication.class, args);
		Coder c1=context.getBean(Coder.class);
		c1.dogInfo();
	}

}
