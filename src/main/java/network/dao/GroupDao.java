package network.dao;

import network.data.Database;
import network.model.Group;

public class GroupDao {

    public Group[] getAll() {

        return Database.getAllGroup();

    }
}
