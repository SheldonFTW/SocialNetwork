package network.service;

import network.dao.PostDao;
import network.model.Post;

import java.util.List;

public interface PostService {

    List<Post> getAll();

    List<Post> getByPostTitle(String title);


}
