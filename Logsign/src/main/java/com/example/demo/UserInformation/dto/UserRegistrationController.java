package com.example.demo.UserInformation.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	@Autowired
	private UserService userservice;
	@ModelAttribute("user")
	public UserRegistration userRegistration() {
		return new UserRegistration();
	}	

	@GetMapping
	public String showRegistrationForm() {
		return "Registration.html";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistration userRegistration) {
		userservice.save(userRegistration);
		return "redirect:/registration?success";
	}
}
 