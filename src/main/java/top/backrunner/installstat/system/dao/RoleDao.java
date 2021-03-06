package top.backrunner.installstat.system.dao;

import top.backrunner.installstat.core.dao.BaseDao;
import top.backrunner.installstat.system.entity.RoleInfo;

public interface RoleDao extends BaseDao<RoleInfo> {
    public RoleInfo findById(Long id);
    public RoleInfo findByName(String name);
    public boolean exists(String name);
}
