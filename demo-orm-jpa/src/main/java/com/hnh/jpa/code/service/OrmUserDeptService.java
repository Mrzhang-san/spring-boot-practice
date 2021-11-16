package com.hnh.jpa.code.service;

import com.hnh.jpa.code.entity.OrmUserDept;
import java.util.List;

/**
 * Spring Boot Demo Orm 系列示例表(OrmUserDept)表服务接口
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
public interface OrmUserDeptService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrmUserDept queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrmUserDept> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ormUserDept 实例对象
     * @return 实例对象
     */
    OrmUserDept insert(OrmUserDept ormUserDept);

    /**
     * 修改数据
     *
     * @param ormUserDept 实例对象
     * @return 实例对象
     */
    OrmUserDept update(OrmUserDept ormUserDept);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}