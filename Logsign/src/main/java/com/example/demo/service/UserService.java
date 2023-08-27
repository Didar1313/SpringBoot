package com.example.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserInformation.dto.UserRegistration;
import com.example.demo.information.Role;
import com.example.demo.information.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public User save(UserRegistration registration) {
		User user=new User(registration.getFirstName(),registration.getLastName(),registration.getEmail(),registration.getPassword(),Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}
}
