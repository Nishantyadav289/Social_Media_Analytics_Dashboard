package com.app.dashboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dashboard.pojo.User;
import com.app.dashboard.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired 
	private UserService userService;
	
	@GetMapping
    public List<User> getAllUsers() {
		System.out.println("UserController.getAllUsers()");
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
    	System.out.println("UserController.getUserById()");
        Optional<User> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
    	System.out.println("UserController.createUser()");
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
    	System.out.println("UserController.deleteUser()");
        userService.deleteUser(id);
    }
}