package network.service.impl;

import network.dao.GroupDao;
import network.dao.impl.GroupDaoImpl;
import network.model.Group;
import network.service.GroupService;

import java.util.List;

public class GroupServiceImpl implements GroupService {

    @Override
    public List<Group> getAll() {
        final GroupDao groupDao = new GroupDaoImpl();
        return groupDao.getAll();
    }

    @Override
    public List<Group> getByName(String name) {
        final GroupDao groupDao = new GroupDaoImpl();
        return groupDao.getByName(name);
    }
}
