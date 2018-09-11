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
public class Dorpay extends Model<Dorpay> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 宿舍缴费项目id
     */
    @TableField("dorPayment_id")
    private String dorpaymentId;
    /**
     * 0为“待缴”，1为“已缴”
     */
    @TableField("pay_status")
    private Integer payStatus;
    /**
     * 缴费金额
     */
    private String cost;
    /**
     * 缴费的宿舍
     */
    @TableField("dormitory_id")
    private Integer dormitoryId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 支付时间，未支付为null
     */
    @TableField("pay_time")
    private Date payTime;
    @TableField("is_delete")
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDorpaymentId() {
        return dorpaymentId;
    }

    public void setDorpaymentId(String dorpaymentId) {
        this.dorpaymentId = dorpaymentId;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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
        return "Dorpay{" +
        ", id=" + id +
        ", dorpaymentId=" + dorpaymentId +
        ", payStatus=" + payStatus +
        ", cost=" + cost +
        ", dormitoryId=" + dormitoryId +
        ", createTime=" + createTime +
        ", payTime=" + payTime +
        ", isDelete=" + isDelete +
        "}";
    }
}
