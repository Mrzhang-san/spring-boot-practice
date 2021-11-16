package com.hnh.jpa.code.service.impl;

import com.hnh.jpa.code.entity.OrmUser;
import com.hnh.jpa.code.dao.OrmUserDao;
import com.hnh.jpa.code.service.OrmUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Spring Boot Demo Orm 系列示例表(OrmUser)表服务实现类
 *
 * @author makejava
 * @since 2021-11-16 15:49:19
 */
@Service("ormUserService")
public class OrmUserServiceImpl implements OrmUserService {
    @Resource
    private OrmUserDao ormUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrmUser queryById(Integer id) {
        return this.ormUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrmUser> queryAllByLimit(int offset, int limit) {
        return this.ormUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ormUser 实例对象
     * @return 实例对象
     */
    @Override
    public OrmUser insert(OrmUser ormUser) {
        this.ormUserDao.insert(ormUser);
        return ormUser;
    }

    /**
     * 修改数据
     *
     * @param ormUser 实例对象
     * @return 实例对象
     */
    @Override
    public OrmUser update(OrmUser ormUser) {
        this.ormUserDao.update(ormUser);
        return this.queryById(ormUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ormUserDao.deleteById(id) > 0;
    }
}