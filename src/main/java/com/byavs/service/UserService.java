package com.byavs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byavs.entity.User;
import com.byavs.mapper.UserMapper;


/**
 * @author Byavs
 *
 * 2018年12月26日
 */
@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAll() {
		return userMapper.getAll();
	}
	
	public User findByName(String userName) {
		return userMapper.findByName(userName);
	}

}
