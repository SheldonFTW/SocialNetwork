package network.service;

import network.dao.UserDao;
import network.model.User;

import java.util.List;

public class UserService {

    public List<User> getAll() {
        final UserDao userDao = new UserDao();
        return userDao.getAll();
    }

    public User getFirst() {
        final UserDao userDao = new UserDao();
        return userDao.getFirs();
    }

    public User getByName(String name) {
        final UserDao userDao = new UserDao();
        return userDao.getByName(name);
    }

    public User getByAge(Integer age) {
        final UserDao userDao = new UserDao();
        return userDao.getByAge(age);
    }
}
