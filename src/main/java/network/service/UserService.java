package network.service;

import network.dao.UserDao;
import network.model.User;

import java.util.List;

public class UserService {

    public List<User> getAll() {
        final UserDao userDao = new UserDao();
        return userDao.getAll();
    }


}
