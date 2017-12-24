package network.dao;

import network.data.Database;
import network.exeption.NoFoundGroupException;
import network.model.Group;

import java.util.LinkedList;
import java.util.List;

public interface GroupDao {

    List<Group> getAll();
    List<Group> getByName(String name);

}
