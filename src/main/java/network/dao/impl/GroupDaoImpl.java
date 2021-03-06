package network.dao.impl;

import network.dao.GroupDao;
import network.data.Database;
import network.exeption.NoFoundGroupException;
import network.model.Group;

import java.util.LinkedList;
import java.util.List;

public class GroupDaoImpl  implements GroupDao {
    @Override
    public List<Group> getAll() {
        return Database.getAllGroup();
    }

    @Override
    public List<Group> getByName(String name) {
        List<Group> groups = getAll();
        List<Group> groupByName = new LinkedList<>();
        for (Group elem : groups) {
            if (name.equals(elem.getName())) {
                groupByName.add(elem);
            }
        }
        if (groupByName.size() == 0) {
            throw new NoFoundGroupException();
        }
        return groups;
    }
}
