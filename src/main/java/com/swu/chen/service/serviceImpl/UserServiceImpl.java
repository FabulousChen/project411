package com.swu.chen.service.serviceImpl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.swu.chen.Util.BaseResult.SimpleResultDTO;
import com.swu.chen.Util.DTO.UserDto;
import com.swu.chen.Util.VO.UserVo;
import com.swu.chen.entity.User;
import com.swu.chen.mapper.UserMapper;
import com.swu.chen.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 123
 * @since 2018-09-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
   @Autowired
   private UserMapper userMapper;

    @Override
    public SimpleResultDTO addUser( UserDto userDto) {
        if(null==userDto){
            return new SimpleResultDTO(false,"输入参数不合法");
        }
        EntityWrapper<User> entityWrapper=new EntityWrapper<>();
        entityWrapper.eq("user_name",userDto.getUserName());
        List<Object> objects = userMapper.selectObjs(entityWrapper);
        if(objects.size()>0){
            return new SimpleResultDTO(false,"用户名已经存在");
        }
        User user=new User();
        try {
            BeanUtils.copyProperties(userDto,user);
            userMapper.insert(user);
        }catch (Exception e){
            e.printStackTrace();
            return new SimpleResultDTO(false,"注册失败");
        }
        return new SimpleResultDTO(user.getId());
    }

    @Override
    public SimpleResultDTO deleteUser(Integer id) {
        if(id==null){
            return new SimpleResultDTO(false,"该条记录不存在");
        }
        User user = userMapper.selectById(id);
        if(user==null){
            return new SimpleResultDTO(false,"该用户不存在");
        }
        try {
            userMapper.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return new SimpleResultDTO(false,"删除失败");
        }
        return new SimpleResultDTO(id);
    }

    @Override
    public SimpleResultDTO updateUser(UserDto userDto) {
        if(userDto.getId()==null){
            return new SimpleResultDTO(false,"修改用户信息需要用户id");
        }
        User user1 = userMapper.selectById(userDto.getId());
        if(user1==null){
            return new SimpleResultDTO(false,"id不存在");
        }
        User user=new User();
        BeanUtils.copyProperties(userDto,user);
        try {
            userMapper.updateAllColumnById(user);
        }catch (Exception e){
            e.printStackTrace();
            return new SimpleResultDTO(false,"修改用户信息失败");
        }
        return new SimpleResultDTO(userDto.getId());
    }

    @Override
    public SimpleResultDTO findById(Integer id) {
        if(id==null){
            return new SimpleResultDTO(false,"用户id不能为空");
        }
        User user = userMapper.selectById(id);
        if(user==null){
            return new SimpleResultDTO(false,"用户不存在");
        }
        UserVo userVo=new UserVo();
        BeanUtils.copyProperties(user,userVo);
        return new SimpleResultDTO(userVo);
    }

    @Override
    public SimpleResultDTO isTrue(UserDto userDto) {
        if(userDto.getUserName().trim()!=null&&userDto.getPassword().trim()!=null){
            EntityWrapper<User> entityWrapper=new EntityWrapper<>();
            entityWrapper.eq("user_name",userDto.getUserName());
            entityWrapper.eq("password",userDto.getPassword());
            List<Object> objects = userMapper.selectObjs(entityWrapper);
            if(objects.size()==1){
                return new SimpleResultDTO("true");
            }else {
                return new SimpleResultDTO(false,"false");
            }
        }else {
            return new SimpleResultDTO(false,"false");
        }
    }
}
