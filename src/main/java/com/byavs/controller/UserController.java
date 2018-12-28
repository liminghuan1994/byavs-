package com.byavs.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Byavs
 *
 * 2018年12月28日
 */
@Controller
@RequestMapping("/user")
public class UserController {


    /**
     * 用户角色;
     * @return
     */
    @RequestMapping("/user")
    @RequiresRoles("admin")
    public String userInfoAdmin(){
        return "userInfo";
    }


    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("user:create")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }


    /**
     * 用户更新;
     * @return
     */
    @RequestMapping("/userUpdate")
    @RequiresPermissions("user:update")//权限管理;
    public String userUpd(){
        return "userInfoUpd";
    }
    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDelete")
    @RequiresPermissions("user:delete")//权限管理;
    public String userDel() {
    	return "userInfoDel";
    } 
    
}