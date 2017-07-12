package com.zhaoyb.dao;

import com.zhaoyb.domain.User;

public interface UserDao {
	
	void saveUser(User user);
	
	void deleteUserById(Integer id);
	
	void updateUser(User user);
	
	User findUserByName(String name);
}
