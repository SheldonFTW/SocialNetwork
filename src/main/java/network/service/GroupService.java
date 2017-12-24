package network.service;

import network.dao.GroupDao;
import network.model.Group;

import java.util.List;

public interface GroupService {

    List<Group> getAll();
    List<Group> getByName(String name);

}
