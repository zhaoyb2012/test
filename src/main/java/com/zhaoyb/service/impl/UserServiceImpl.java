package com.zhaoyb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.zhaoyb.domain.User;
import com.zhaoyb.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private MongoTemplate mongoTemplate;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		mongoTemplate.save(user);
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("id").is(id));
		mongoTemplate.remove(query,User.class);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("id").is(user.getId()));
		Update update = new Update().set("name", user.getName()).set("age", user.getAge());
		mongoTemplate.updateFirst(query, update, User.class);
	}

	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("name").is(name));
		return mongoTemplate.findOne(query, User.class);
	}

}
