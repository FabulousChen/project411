package com.swu.chen.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author chen123
 * @since 2018-09-07
 */
@Data
@ToString
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮箱
     */
    private String email;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
