package network.service;

import network.dao.GroupDao;
import network.model.Group;

public class GroupService {

    public Group[] getAll(){
        final GroupDao groupDao = new GroupDao();
        return groupDao.getAll();
    }

}
