package network.dao;

import network.data.Database;
import network.model.Group;

import java.util.List;

public class GroupDao {

    public List<Group> getAll() {

        return Database.getAllGroup();

    }
}
