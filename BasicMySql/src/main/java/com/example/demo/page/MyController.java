package com.example.demo.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.ProgrammerClass.Programmer;
import com.example.demo.repo.ProgrammerRepo;

@Controller
public class MyController {
	@Autowired
	ProgrammerRepo pr;
	@GetMapping("/homePage")
	public String homePage() {
		return "HomePage.html";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute Programmer programmer) {
		pr.save(programmer);
		return "ProgrammerInfo.html";
	}
}
