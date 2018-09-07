package com.swu.chen.controller;


import com.swu.chen.Util.BaseResult.SimpleResultDTO;
import com.swu.chen.Util.VO.UserVo;
import com.swu.chen.entity.User;
import com.swu.chen.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chen123
 * @since 2018-09-07
 */
@Api(description = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserContrroller {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "通过id查询用户")
    @GetMapping(value = "/selectById")
    public SimpleResultDTO selectById(@RequestParam("id")Integer id){
        if(id==null){
            return new SimpleResultDTO(false,"id不能为空");
        }
        User user = userService.selectById(id);
        if(user==null){
            return new SimpleResultDTO(false,"该记录不存在");
        }else {
            UserVo userVo = new UserVo();
            BeanUtils.copyProperties(userService.selectById(id),userVo);
            return new SimpleResultDTO(userVo);
        }
    }
}

