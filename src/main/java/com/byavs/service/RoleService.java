package com.byavs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byavs.mapper.PermissionMapper;
import com.byavs.mapper.RoleMapper;


/**
 * @author Byavs
 *
 * 2018年12月26日
 */
@Service
public class RoleService {
	
	@Autowired
	private RoleMapper roleMapper;
	

	public List<String> findRoles(String userName) {
		return roleMapper.findRoles(userName);
	}

}
