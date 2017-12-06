package network.dao;

import network.data.Database;
import network.model.Post;

public class PostDao {
    public Post[] getAll() {

        return Database.getAllPost();

    }
}
