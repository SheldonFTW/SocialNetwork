package network.dao;

import network.data.Database;
import network.model.User;

import java.util.List;

public class UserDao {

    public List<User> getAll() {

        return Database.getAllUsers();

    }



}
