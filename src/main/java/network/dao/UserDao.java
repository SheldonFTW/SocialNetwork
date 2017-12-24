package network.dao;

import network.data.Database;
import network.exeption.NoFoundUserException;
import network.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public interface UserDao {

    List<User> getAll();
    User getFirs();
    List<User> getByName(String name);
    User getByAge(Integer age);
}
