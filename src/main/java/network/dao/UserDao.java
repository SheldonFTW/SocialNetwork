package network.dao;

import network.data.Database;
import network.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class UserDao {

    private static final int FIRST_INDEX = 0;

    public List<User> getAll() {
        return Database.getAllUsers();
    }

    public User getFirs() {
        return Database.getAllUsers().get(FIRST_INDEX);
    }

    public User getByName(String name) {
        List<User> users = getAll();
        for (User elem : users) {
            if (name.equals(elem.getName())) {
                return elem;
            } else if (!name.equals(elem.getName())) {
                System.out.println("There is no such user");
            }
        }
        return null;
    }

    public User getByAge(Integer age) {
        List<User> users = getAll();
        for (User elemAge : users) {
            if (age.equals(elemAge.getAge())) {
                return elemAge;
            } else if (!elemAge.equals(elemAge.getAge())) {
                System.out.println("There is no user with such age");
            }
        }
        return null;
    }

}
