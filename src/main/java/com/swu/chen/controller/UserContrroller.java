package com.swu.chen.controller;


import com.swu.chen.Util.BaseResult.SimpleResultDTO;
import com.swu.chen.Util.DTO.UserDto;
import com.swu.chen.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 123
 * @since 2018-09-12
 */
@Api(description = "用户信息相关接口")
@RestController
@RequestMapping(value = "/user")
public class UserContrroller {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户注册")
    @PostMapping(value = "addUser")
    public SimpleResultDTO addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

    @ApiOperation(value = "用户删除")
    @GetMapping(value = "deleteUser")
    public SimpleResultDTO deleteUser(Integer id){
        return userService.deleteUser(id);
    }
    @ApiOperation(value = "修改用户信息")
    @PostMapping(value = "updateUser")
    public SimpleResultDTO updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @ApiOperation(value = "通过用户查找id")
    @GetMapping(value = "findById")
    public SimpleResultDTO findById(Integer id){
        return userService.findById(id);
    }

    @ApiOperation(value = "判断用户是否可以登录")
    @GetMapping(value = "isTrue")
    public SimpleResultDTO isTrue(UserDto userDto){
        return userService.isTrue(userDto);
    }

}

