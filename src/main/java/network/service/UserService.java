package network.service;

import network.dao.UserDao;
import network.model.User;

public class UserService {

    public User[] getAll() {
        final UserDao userDao = new UserDao();
        return userDao.getAll();
    }


}
