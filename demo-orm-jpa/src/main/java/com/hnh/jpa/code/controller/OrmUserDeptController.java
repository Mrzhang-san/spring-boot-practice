package com.hnh.jpa.code.controller;

import com.hnh.jpa.code.entity.OrmUserDept;
import com.hnh.jpa.code.service.OrmUserDeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Spring Boot Demo Orm 系列示例表(OrmUserDept)表控制层
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
@RestController
@RequestMapping("ormUserDept")
public class OrmUserDeptController {
    /**
     * 服务对象
     */
    @Resource
    private OrmUserDeptService ormUserDeptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrmUserDept selectOne(Integer id) {
        return this.ormUserDeptService.queryById(id);
    }

}