package network.controller;

import network.model.Group;
import network.service.GroupService;

public class GroupController {
    public static void main(String[] args) {

        final GroupService groupService = new GroupService();
        final Group[] groups = groupService.getAll();
        for (Group elems : groups) {
            System.out.println(elems);
        }
    }
}
