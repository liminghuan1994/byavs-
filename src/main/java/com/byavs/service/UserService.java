package com.byavs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byavs.entity.User;
import com.byavs.mapper.UserMapper;

/**
 * @Auther: cpb
 * @Date: 2018/8/10 10:39
 * @Description:
 */

@Service
public class UserService implements UserMapper{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getAll() {
		return userMapper.getAll();
	}
	
	@Override
	public User findByName(String userName) {
		return userMapper.findByName(userName);
	}

}
