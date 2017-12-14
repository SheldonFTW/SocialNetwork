package network.dao;

import network.data.Database;
import network.model.Post;

import java.util.List;

public class PostDao {

    public List<Post> getAll() {

        return Database.getAllPost();

    }
}
