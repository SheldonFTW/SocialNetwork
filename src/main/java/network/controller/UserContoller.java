package network.controller;

import network.exeption.NoFoundGroupException;
import network.exeption.NoFoundPostException;
import network.exeption.NoFoundUserException;
import network.model.User;
import network.service.UserService;
import network.service.impl.UserServiceImpl;

import java.util.List;

public class UserContoller {
    public static void main(String[] args) {

        final UserService userService = new UserServiceImpl();
        List<User> users = userService.getAll();

        for (User elem : users) {
            System.out.println(elem);
        }

        System.out.println("All users printed");

        User firstUser = userService.getFirst();
        System.out.println(firstUser);

        System.out.println("First user printed");

        List<User> userServiceByName = userService.getByName("Dima");
        for (User elem : userServiceByName) {
            System.out.println("Get by name: " + elem);

        }

        User getByAge = userService.getByAge(28);
        System.out.println("Get by age:" + getByAge);


    }

}
