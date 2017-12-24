package network.dao;

import network.data.Database;
import network.exeption.NoFoundPostException;
import network.model.Post;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface PostDao {

    List<Post> getAll();
    List<Post> getByPostTitle(String title);

}
