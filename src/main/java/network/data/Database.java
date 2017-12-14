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

        User user1 = new User("boriabritva@gmail.com", "5014095", "Dima", 28,"Single");
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

        Post post = new Post("Spotr", "Soccer", 10, "01.01.17");
        Post post2 = new Post("Sosial", "Live", 12, "01.12.17");
        Post post3 = new Post("Fun", "haha", 16, "11.11.17");
        Post post4 = new Post("Etc", "HZ", 16, "01.11.17");

        posts.add(post);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        return posts;

    }

    public static List<Group> getAllGroup() {

        List<Group> groups = new LinkedList<>();

        Group group1 = new Group("Fun", "Crazy things", 10, "01.12.14");
        Group group2 = new Group("Social", "Human behavior", 44, "07.03.17");
        Group group3 = new Group("Politic", "Braking news ", 1, "05.06.13");
        Group group4 = new Group("Enveromental Protection", "Forest", 44, "12.06.12");
        Group group5 = new Group("Science", "Space", 50, "19.02.10");

        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        groups.add(group4);
        groups.add(group5);

        return groups;

    }
}

