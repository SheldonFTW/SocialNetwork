package network.dao.impl;

import network.dao.UserDao;
import network.data.Database;
import network.exeption.NoFoundUserException;
import network.model.User;

import java.util.LinkedList;
import java.util.List;


public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getAll() {
        return Database.getAllUsers();
    }
    private static final int FIRST_INDEX = 0;

    @Override
    public User getFirs() {
        Database.getAllUsers().get(FIRST_INDEX);
        return Database.getAllUsers().get(FIRST_INDEX);
    }

    @Override
    public List<User> getByName(String name) {
        List<User> users = getAll();
        List<User> usersByName = new LinkedList<>();
        for (User elem : users) {
            if (name.equals(elem.getName())) {
                usersByName.add(elem);
            }
        }
        if (usersByName.size() == 0) {
            throw new NoFoundUserException();
        }
        return usersByName;
    }

    @Override
    public User getByAge(Integer age) {
        List<User> users = getAll();
        for (User elemAge : users) {
            if (age.equals(elemAge.getAge())) {
                return elemAge;
            }
        }
        return null;
    }
}
