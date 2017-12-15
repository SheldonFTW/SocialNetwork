package network.service;

import network.dao.GroupDao;
import network.model.Group;

import java.util.List;

public class GroupService {

    public List<Group> getAll(){
        final GroupDao groupDao = new GroupDao();
        return groupDao.getAll();
    }
    public List<Group> getByName(String name) {
        final GroupDao groupDao = new GroupDao();
        return groupDao.getByName(name);
    }
}
