package com.gx.fm.controller;


import com.gx.fm.config.datasources.DataSource;
import com.gx.fm.entity.User;
import com.gx.fm.service.UserService;
import com.gx.fm.utils.UtilId;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> selAllUser(){
        return userService.selUserList();
    }

    @GetMapping(value = "/add")
    public Boolean addUser(){
        User user = new User();
        String id = UtilId.UUID();
        user.setId(id);
        user.setUsername("user");
        user.setPassword("123456");
        user.setSex("1");
        user.setType("0");
        user.setCreatetime(new Date());
        return userService.addUser(user);
    }


}

