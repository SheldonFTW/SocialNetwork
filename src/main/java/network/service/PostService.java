package network.service;

import network.dao.PostDao;
import network.dao.UserDao;
import network.model.Post;

public class PostService {

    public Post[] getAll() {
        final PostDao postDao = new PostDao();
        return postDao.getAll();

    }


}
