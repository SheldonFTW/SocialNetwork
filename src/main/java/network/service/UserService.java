package network.service;

import network.dao.UserDao;
import network.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getFirst();
    List<User> getByName(String name);
    User getByAge(Integer age);

}
