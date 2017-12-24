package network.data;

import network.model.Group;
import network.model.Post;
import network.model.User;
import training.Alex;

import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<User> getAllUsers() {

        List<User> users = new LinkedList<>();

        User user1 = new User("boriabritva@gmail.com", "5014095", "Dima", 28, "single");
        User user2 = new User("apetrovich@gmail.com", "tratata123", "Andrew", 30, "Single");
        User user3 = new User("katerina@gmail.com ", "trumpurum456", "Katia",28,"Single");
        User user4 = new User("sheldon@gmail.com", "atata890", "Roman", 29,"Single");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return users;

    }

    public static List<Post> getAllPost() {

        List<Post> posts = new LinkedList<>();

        Post post = new Post("Post1", "ets");
        Post post2 = new Post("Post2", "ets");
        Post post3 = new Post("Post3", "ets");
        Post post4 = new Post("Post4", "ets");

        posts.add(post);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        return posts;

    }

    public static List<Group> getAllGroup() {

        List<Group> groups = new LinkedList<>();

        Group group1 = new Group("Group1");
        Group group2 = new Group("Group2");
        Group group3 = new Group("Group3");
        Group group4 = new Group("Group4");
        Group group5 = new Group("Group5");

        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        groups.add(group4);
        groups.add(group5);

        return groups;

    }
}

