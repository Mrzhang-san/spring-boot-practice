package com.hnh.jpa.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * Spring Boot Demo Orm 系列示例表(OrmUserDept)实体类
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
public class OrmUserDept implements Serializable {
    private static final long serialVersionUID = 992150657679052154L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 部门id
    */
    private Integer deptId;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 上次更新时间
    */
    private Date lastUpdateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

}