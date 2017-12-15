package network.controller;

import network.model.Post;
import network.service.PostService;

import java.util.List;

public class PostController {
    public static void main(String[] args) {

        final PostService postService = new PostService();
        List<Post> posts = postService.getAll();

        for (Post elems : posts) {
            System.out.println(elems);
        }

        List<Post> postTitle = postService.getByPostTitle("Etc");
        for (Post elem : postTitle) {
            System.out.println("Get by post title: " + elem);

        }

    }
}
