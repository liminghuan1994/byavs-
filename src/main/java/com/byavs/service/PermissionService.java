package com.byavs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byavs.mapper.PermissionMapper;


/**
 * @author Byavs
 *
 * 2018年12月26日
 */
@Service
public class PermissionService {
	
	@Autowired
	private PermissionMapper permissionMapper;
	
	public List<String> findPermissions(String userName) {
		return permissionMapper.findPermissions(userName);
	}

}
