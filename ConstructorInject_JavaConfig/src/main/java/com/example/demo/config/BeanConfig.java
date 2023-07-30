package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.ConstructorPackage.Coder;
import com.example.demo.ConstructorPackage.Computer;

;

@Configuration
public class BeanConfig {
	@Bean
	public Coder coder1(Computer computer) {
		Coder c1=new Coder("JS","Bhuiyan",1002,computer);
		return c1;
	}
	@Bean
	public Computer computer1() {
		Computer com2=new Computer("Intel");

		return com2;
	}

}