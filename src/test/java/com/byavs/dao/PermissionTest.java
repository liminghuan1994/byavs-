package com.byavs.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.byavs.mapper.PermissionMapper;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther: cpb
 * @Date: 2018/8/2 09:49
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PermissionTest {
    @Resource
    private PermissionMapper permissionMapper;



    @Test
    public void test(){
       List<String> list = permissionMapper.findPermissions("zhang");
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
    }


}
