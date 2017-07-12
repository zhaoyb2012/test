package com.zhaoyb.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.zhaoyb.dao.UserDao;
import com.zhaoyb.domain.User;

@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into t_user(name) values(?)";
		jdbcTemplate.update(sql,new Object[]{user.getName()},new int[]{java.sql.Types.VARCHAR});

	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
