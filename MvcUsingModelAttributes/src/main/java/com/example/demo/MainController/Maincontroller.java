package com.example.demo.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Info.Programmer;

@Controller
public class Maincontroller {
	@RequestMapping("/Ready")
	public String homePage() {
		return "HomePage.html";
	}
	
	@RequestMapping("/addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer programmer) {
		return "ProgrammerInfo.html";
	}
}
