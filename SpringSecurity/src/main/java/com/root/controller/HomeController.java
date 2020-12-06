package com.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.root.model.Student;

@RestController
public class HomeController 
{
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@PostMapping("/data")
	public void LandingPage(@RequestBody Student s)
	{
	String encodedpass=	bcrypt.encode(s.getPassword());
	System.out.println(s.getEmail());
	System.out.println(encodedpass);
		
		
	}
	

}
