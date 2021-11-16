package com.hnh.jpa.code.controller;

import com.hnh.jpa.code.entity.OrmUser;
import com.hnh.jpa.code.service.OrmUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Spring Boot Demo Orm 系列示例表(OrmUser)表控制层
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
@RestController
@RequestMapping("ormUser")
public class OrmUserController {
    /**
     * 服务对象
     */
    @Resource
    private OrmUserService ormUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrmUser selectOne(Integer id) {
        return this.ormUserService.queryById(id);
    }

}