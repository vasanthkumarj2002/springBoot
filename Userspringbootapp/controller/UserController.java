package org.jsp.Userspringbootapp.controller;

import java.util.List;

import org.jsp.Userspringbootapp.Dto.User;
import org.jsp.Userspringbootapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService  service;

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping("/users/{id}")
	public User findUser(@PathVariable int id) {
		return service.findUser(id);
	}

	@GetMapping("/users")
	public List<User> findAll() {
		return service.findAll();
	}

	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
}
