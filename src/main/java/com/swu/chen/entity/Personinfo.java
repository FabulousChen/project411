package com.swu.chen.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
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
public class Personinfo extends Model<Personinfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 名字
     */
    private String name;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 学院
     */
    private String college;
    /**
     * 年级
     */
    @TableField("the_grade")
    private String theGrade;
    /**
     * 班级
     */
    @TableField("the_class")
    private String theClass;
    /**
     * 学号
     */
    @TableField("student_id")
    private Integer studentId;
    /**
     * 宿舍
     */
    @TableField("dormitory_id")
    private Integer dormitoryId;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTheGrade() {
        return theGrade;
    }

    public void setTheGrade(String theGrade) {
        this.theGrade = theGrade;
    }

    public String getTheClass() {
        return theClass;
    }

    public void setTheClass(String theClass) {
        this.theClass = theClass;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(Integer dormitoryId) {
        this.dormitoryId = dormitoryId;
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
        return "Personinfo{" +
        ", id=" + id +
        ", name=" + name +
        ", sex=" + sex +
        ", college=" + college +
        ", theGrade=" + theGrade +
        ", theClass=" + theClass +
        ", studentId=" + studentId +
        ", dormitoryId=" + dormitoryId +
        ", createTime=" + createTime +
        ", lastEditTime=" + lastEditTime +
        ", isDelete=" + isDelete +
        "}";
    }
}
