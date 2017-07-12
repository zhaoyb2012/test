package com.zhaoyb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhaoyb.domain.User;
import com.zhaoyb.service.UserService;

@RequestMapping(value="user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="add")
	public void addUser(){
		User user = new User();
		user.setAge(20);
		user.setName("hello");
		System.out.println("添加一个用户到mongoDb数据库");
		userService.saveUser(user);
	}
	
	
	
	@GetMapping(value="query")
	public String queryUserByName(@RequestParam(value="name")String name){
		User user = userService.findUserByName(name);
		return user.getAge()+"";
	}
}
