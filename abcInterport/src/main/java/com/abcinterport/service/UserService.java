package com.abcinterport.service;

import com.abcinterport.entity.User; 

public interface UserService {
	
	public Iterable<User> getAllUsers();
	
	public User createUser(User user) throws Exception;

}
