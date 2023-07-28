package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.ImportResource;

import com.example.demo.Package.Coder;
@ImportResource("classpath:BeandConfig.xml")
@SpringBootApplication
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		Coder c1= (Coder) context.getBean("coder1");
	}

}
