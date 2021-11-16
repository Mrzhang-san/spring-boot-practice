package com.hnh.jpa.code.dao;

import com.hnh.jpa.code.entity.OrmUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Spring Boot Demo Orm 系列示例表(OrmUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
public interface OrmUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrmUser queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrmUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ormUser 实例对象
     * @return 对象列表
     */
    List<OrmUser> queryAll(OrmUser ormUser);

    /**
     * 新增数据
     *
     * @param ormUser 实例对象
     * @return 影响行数
     */
    int insert(OrmUser ormUser);

    /**
     * 修改数据
     *
     * @param ormUser 实例对象
     * @return 影响行数
     */
    int update(OrmUser ormUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}