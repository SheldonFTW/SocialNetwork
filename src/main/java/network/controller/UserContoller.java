package network.controller;

import network.model.User;
import network.service.UserService;

import javax.xml.ws.Service;
import java.util.List;

public class UserContoller {
    public static void main(String[] args) {

        final UserService userService = new UserService();
        List<User> users = userService.getAll();

        for (User elem : users) {
            System.out.println(elem);
        }

        System.out.println("All users printed");

        User firstUser = userService.getFirst();
        System.out.println(firstUser);

        System.out.println("First user printed");

        User getByName = userService.getByName("Dima");
        System.out.println("Get by name: " + getByName);

        User getByAge = userService.getByAge(28);
        System.out.println("Get by age:" + getByAge);

    }





}
