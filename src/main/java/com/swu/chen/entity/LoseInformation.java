package com.swu.chen.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 123
 * @since 2018-09-12
 */
@TableName("lose_information")
public class LoseInformation extends Model<LoseInformation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 地点
     */
    private String place;
    /**
     * 物品
     */
    private String item;
    /**
     * 物品描述
     */
    @TableField("item_desc")
    private String itemDesc;
    /**
     * 图片
     */
    private Blob picture;
    /**
     * 联系人
     */
    private String people;
    /**
     * 联系方式
     */
    private String iphone;
    /**
     * 丢失时间：故意没用data，让用户自己输入
     */
    @TableField("loss_time")
    private String lossTime;
    /**
     * 创建时间
     */
    @TableField("creat_time")
    private Date creatTime;
    /**
     * 修改时间
     */
    @TableField("mod_time")
    private Date modTime;
    /**
     * 状态：0未找到，1：已找到
     */
    private Integer status;
    /**
     * 审核状态:默认是0，管理员同意后是1
     */
    @TableField("audit_status")
    private Integer auditStatus;
    @TableField("is_delete")
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getLossTime() {
        return lossTime;
    }

    public void setLossTime(String lossTime) {
        this.lossTime = lossTime;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
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
        return "LoseInformation{" +
        ", id=" + id +
        ", place=" + place +
        ", item=" + item +
        ", itemDesc=" + itemDesc +
        ", picture=" + picture +
        ", people=" + people +
        ", iphone=" + iphone +
        ", lossTime=" + lossTime +
        ", creatTime=" + creatTime +
        ", modTime=" + modTime +
        ", status=" + status +
        ", auditStatus=" + auditStatus +
        ", isDelete=" + isDelete +
        "}";
    }
}
