package com.hnh.jpa.code.dao;

import com.hnh.jpa.code.entity.OrmUserDept;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Spring Boot Demo Orm 系列示例表(OrmUserDept)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
public interface OrmUserDeptDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrmUserDept queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrmUserDept> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ormUserDept 实例对象
     * @return 对象列表
     */
    List<OrmUserDept> queryAll(OrmUserDept ormUserDept);

    /**
     * 新增数据
     *
     * @param ormUserDept 实例对象
     * @return 影响行数
     */
    int insert(OrmUserDept ormUserDept);

    /**
     * 修改数据
     *
     * @param ormUserDept 实例对象
     * @return 影响行数
     */
    int update(OrmUserDept ormUserDept);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}