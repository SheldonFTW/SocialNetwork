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

    }





}
