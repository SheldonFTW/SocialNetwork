package network.dao;

import network.data.Database;
import network.model.User;

public class UserDao {

    public User[] getAll() {

        return Database.getAllUsers();

    }



}
