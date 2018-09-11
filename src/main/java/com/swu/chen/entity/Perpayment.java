package com.swu.chen.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 123
 * @since 2018-09-11
 */
public class Perpayment extends Model<Perpayment> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 缴费项目名称
     */
    private String name;
    /**
     * 要缴费的人
     */
    @TableField("person_name")
    private String personName;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 最后一次修改时间
     */
    @TableField("last_edit_time")
    private Date lastEditTime;
    @TableField("is_delete")
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Perpayment{" +
        ", id=" + id +
        ", name=" + name +
        ", personName=" + personName +
        ", createTime=" + createTime +
        ", lastEditTime=" + lastEditTime +
        ", isDelete=" + isDelete +
        "}";
    }
}
