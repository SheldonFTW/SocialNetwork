package network.service.impl;

import network.dao.PostDao;
import network.dao.impl.PostDaoImpl;
import network.model.Post;
import network.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {
    @Override
    public List<Post> getAll() {
        final PostDao postDao = new PostDaoImpl();
        return postDao.getAll();
    }

    @Override
    public List<Post> getByPostTitle(String title) {
        final PostDao postDao = new PostDaoImpl();
        return postDao.getByPostTitle(title);

    }
}
