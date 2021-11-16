package com.hnh.jpa.code.service.impl;

import com.hnh.jpa.code.entity.OrmUserDept;
import com.hnh.jpa.code.dao.OrmUserDeptDao;
import com.hnh.jpa.code.service.OrmUserDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Spring Boot Demo Orm 系列示例表(OrmUserDept)表服务实现类
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
@Service("ormUserDeptService")
public class OrmUserDeptServiceImpl implements OrmUserDeptService {
    @Resource
    private OrmUserDeptDao ormUserDeptDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrmUserDept queryById(Integer id) {
        return this.ormUserDeptDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrmUserDept> queryAllByLimit(int offset, int limit) {
        return this.ormUserDeptDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ormUserDept 实例对象
     * @return 实例对象
     */
    @Override
    public OrmUserDept insert(OrmUserDept ormUserDept) {
        this.ormUserDeptDao.insert(ormUserDept);
        return ormUserDept;
    }

    /**
     * 修改数据
     *
     * @param ormUserDept 实例对象
     * @return 实例对象
     */
    @Override
    public OrmUserDept update(OrmUserDept ormUserDept) {
        this.ormUserDeptDao.update(ormUserDept);
        return this.queryById(ormUserDept.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ormUserDeptDao.deleteById(id) > 0;
    }
}