package network.data;

import network.model.Group;
import network.model.Post;
import network.model.User;

public class Database {

    public static User[] getAllUsers() {
        User users[] = new User[3];
        final User user = new User("boriabritva@gmail.com", "tratata123", "Diman", 28, "single");
        final User user2 = new User("andrew@gmail.com", "tratata321", "Andrew", 29, "single");
        final User user3 = new User("marina@gmail.com", "tratata231", "Marina", 30, "single");

        users[0] = user;
        users[1] = user2;
        users[2] = user3;

        return users;

    }

    public static Post[] getAllPost() {
        Post posts[] = new Post[4];
        final Post post = new Post("Spotr", "Soccer", 10, "01.01.17");
        final Post post2 = new Post("Sosial", "Live", 12, "01.12.17");
        final Post post3 = new Post("Fun", "haha", 16, "11.11.17");
        final Post post4 = new Post("Etc", "HZ", 16, "01.11.17");

        posts[0] = post;
        posts[1] = post;
        posts[2] = post;
        posts[3] = post;

        return posts;

    }

    public static Group[] getAllGroup() {
        Group groups[] = new Group[5];
        final Group group = new Group("Fun", "Crazy things", 10, "01.12.14");
        final Group group1 = new Group("Social", "Human behavior", 44, "07.03.17");
        final Group group2 = new Group("Politic", "Braking news ", 1, "05.06.13");
        final Group group3 = new Group("Enveromental Protection", "Forest", 44, "12.06.12");
        final Group group4 = new Group("Science", "Space", 50, "19.02.10");

        groups[0] = group;
        groups[1] = group;
        groups[2] = group;
        groups[3] = group;
        groups[4] = group;


        return groups;


    }
}

