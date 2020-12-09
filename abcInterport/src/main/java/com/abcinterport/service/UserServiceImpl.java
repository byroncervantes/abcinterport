package com.abcinterport.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcinterport.entity.User;
import com.abcinterport.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	public Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	private boolean checkUsernameAvailable(User user) throws Exception {
		Optional userFound = userRepository.findByUsername(user.getUsername());
		if (userFound.isPresent()) {
			throw new Exception("Username no disponible");
		}
		return true;
	}

	private boolean checkPasswordValid(User user) throws Exception {
		if ( !user.getPassword().equals(user.getConfirmPassword())) {
			throw new Exception("Password y Confirm Password no son iguales");
		}
		return true;
	}

	@Override
	public User createUser(User formUser) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}