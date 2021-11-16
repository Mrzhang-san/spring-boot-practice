package com.hnh.jpa.code.controller;

import com.hnh.jpa.code.entity.OrmDepartment;
import com.hnh.jpa.code.service.OrmDepartmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Spring Boot Demo Orm 系列示例表(OrmDepartment)表控制层
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
@RestController
@RequestMapping("ormDepartment")
public class OrmDepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private OrmDepartmentService ormDepartmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrmDepartment selectOne(Integer id) {
        return this.ormDepartmentService.queryById(id);
    }

}