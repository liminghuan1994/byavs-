package com.byavs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byavs.mapper.PermissionMapper;
import com.byavs.mapper.RoleMapper;

/**
 * @Auther: cpb
 * @Date: 2018/8/10 10:39
 * @Description:
 */

@Service
public class RoleService {
	
	@Autowired
	private RoleMapper roleMapper;
	

	public List<String> findRoles(String userName) {
		return roleMapper.findRoles(userName);
	}

}
