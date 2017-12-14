package network.service;

import network.dao.PostDao;
import network.model.Post;

import java.util.List;

public class PostService {

    public List<Post> getAll() {
        final PostDao postDao = new PostDao();
        return postDao.getAll();

    }


}
