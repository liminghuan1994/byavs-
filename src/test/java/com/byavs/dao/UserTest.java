package com.byavs.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.byavs.mapper.UserMapper;

import javax.annotation.Resource;

/**
 * @Auther: cpb
 * @Date: 2018/8/2 09:49
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test(){
        userMapper.getAll();
    }
}
