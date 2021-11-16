package com.hnh.jpa.code.service.impl;

import com.hnh.jpa.code.entity.OrmDepartment;
import com.hnh.jpa.code.dao.OrmDepartmentDao;
import com.hnh.jpa.code.service.OrmDepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Spring Boot Demo Orm 系列示例表(OrmDepartment)表服务实现类
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
@Service("ormDepartmentService")
public class OrmDepartmentServiceImpl implements OrmDepartmentService {
    @Resource
    private OrmDepartmentDao ormDepartmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrmDepartment queryById(Integer id) {
        return this.ormDepartmentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrmDepartment> queryAllByLimit(int offset, int limit) {
        return this.ormDepartmentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ormDepartment 实例对象
     * @return 实例对象
     */
    @Override
    public OrmDepartment insert(OrmDepartment ormDepartment) {
        this.ormDepartmentDao.insert(ormDepartment);
        return ormDepartment;
    }

    /**
     * 修改数据
     *
     * @param ormDepartment 实例对象
     * @return 实例对象
     */
    @Override
    public OrmDepartment update(OrmDepartment ormDepartment) {
        this.ormDepartmentDao.update(ormDepartment);
        return this.queryById(ormDepartment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ormDepartmentDao.deleteById(id) > 0;
    }
}