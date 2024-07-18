package com.app.dashboard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dashboard.dao.UserRepository;
import com.app.dashboard.pojo.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		System.out.println("UserService.getAllUsers()");
		return userRepository.findAll();
	}

	public Optional<User> getUserById(Long id) {
		System.out.println("UserService.getUserById()");
		return userRepository.findById(id);
	}

	public User createUser(User user) {
		System.out.println("UserService.createUser()");
		return userRepository.save(user);
	}

	public void deleteUser(Long id) {
		System.out.println("UserService.deleteUser()");
		userRepository.deleteById(id);
	}

}
