package network.data;

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
}
