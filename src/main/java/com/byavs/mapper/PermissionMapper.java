package com.byavs.mapper;

import java.util.List;

/**
 * @Auther: cpb
 * @Date: 2018/8/2 09:46
 * @Description:
 */
public interface PermissionMapper {
    List<String> findPermissions(String userName);

}
