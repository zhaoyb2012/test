package com.zhaoyb.service;

import org.springframework.stereotype.Service;

import com.zhaoyb.domain.User;

@Service
public interface UserService {
	
	void saveUser(User user);
	
	void deleteUserById(Integer id);
	
	void updateUser(User user);
	
	User findUserByName(String name);
}
