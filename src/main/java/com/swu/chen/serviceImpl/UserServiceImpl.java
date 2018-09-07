package com.swu.chen.serviceImpl;

import com.swu.chen.entity.User;
import com.swu.chen.mapper.UserMapper;
import com.swu.chen.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chen123
 * @since 2018-09-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
