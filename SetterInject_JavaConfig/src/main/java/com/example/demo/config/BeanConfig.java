package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SetterPackage.Coder;
import SetterPackage.Computer;

@Configuration
public class BeanConfig {
	@Bean
	public Coder coder1(Computer computer) {
		Coder c1=new Coder();
		c1.setLanguage("Java");
		c1.setName("Didar");
		c1.setId(1001);
		c1.setComputer(computer);
		return c1;
	}
	@Bean
	public Computer computer1() {
		Computer com2=new Computer();
		com2.setBrand("Apple");
		return com2;
	}

}
