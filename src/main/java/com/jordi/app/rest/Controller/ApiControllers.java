package com.jordi.app.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jordi.app.rest.Models.User;
import com.jordi.app.rest.Repo.UserRepo;

@RestController
public class ApiControllers {
	
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping(value = "/")
	public String getPage() {
		return "Welcome!";
	}
	
	@GetMapping(value = "/users")
	public List<User> getUsers() {
		return userRepo.findAll();
	}
	
	@PostMapping(value = "/save")
	public String saveUser(@RequestBody User user) {
		userRepo.save(user);
		return "Saved...";
	}

}
