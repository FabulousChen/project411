package com.swu.chen.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.swu.chen.Util.BaseResult.SimpleResultDTO;
import com.swu.chen.Util.DTO.UserDto;
import com.swu.chen.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 123
 * @since 2018-09-12
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     */
    SimpleResultDTO addUser(UserDto userDto);

    /**
     * 删除用户
     */
    SimpleResultDTO deleteUser(Integer id);
    /**
     * 修改用户信息
     */
    SimpleResultDTO updateUser(UserDto userDto);

    /**
     * 通过id查询
     */
    SimpleResultDTO findById(Integer id);
    /**
     * 判断用户名是否正确
     */
    SimpleResultDTO isTrue(UserDto userDto);
}
