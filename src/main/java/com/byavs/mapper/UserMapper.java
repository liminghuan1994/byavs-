package com.byavs.mapper;

import java.util.List;

import com.byavs.entity.User;

/**
 * @Auther: cpb
 * @Date: 2018/8/2 09:46
 * @Description:
 */
public interface UserMapper {
    List<User> getAll();
    User findByName(String userName);

}
