package com.byavs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byavs.mapper.PermissionMapper;

/**
 * @Auther: cpb
 * @Date: 2018/8/10 10:39
 * @Description:
 */

@Service
public class PermissionService implements PermissionMapper{
	
	@Autowired
	private PermissionMapper permissionMapper;
	
	@Override
	public List<String> findPermissions(String userName) {
		return permissionMapper.findPermissions(userName);
	}

}
