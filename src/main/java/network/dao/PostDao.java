package network.dao;

import network.data.Database;
import network.exeption.NoFoundPostException;
import network.model.Post;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PostDao {

    public List<Post> getAll() {

        return Database.getAllPost();

    }

    public List<Post> getByPostTitle(String title) {
        List<Post> posts = getAll();
        List<Post> postsByTitle = new LinkedList<>();
        for (Post elem : posts) {
            if (title.equals(elem.getTitle())) {
                postsByTitle.add(elem);
            }
        }
        if (postsByTitle.size() == 0) {
            throw new NoFoundPostException();
        }
        return postsByTitle;

    }

}
