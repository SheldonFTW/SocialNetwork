package network.service.impl;

import network.dao.UserDao;
import network.dao.impl.UserDaoImpl;
import network.model.User;
import network.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAll() {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getAll();
    }

    @Override
    public User getFirst() {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getFirs();
    }

    @Override
    public List<User> getByName(String name) {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getByName(name);
    }

    @Override
    public User getByAge(Integer age) {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getByAge(age);
    }
}
