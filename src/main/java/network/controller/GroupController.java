package network.controller;

import network.model.Group;
import network.service.GroupService;

import java.util.List;

public class GroupController {
    public static void main(String[] args) {

        final GroupService groupService = new GroupService();
        List<Group> groups = groupService.getAll();
        for (Group elems : groups) {
            System.out.println(elems);
        }
        List<Group> getByName = groupService.getByName("Fun");
        for (Group elem : getByName) {
            System.out.println("Get group by name: " + elem);

        }



    }

}
