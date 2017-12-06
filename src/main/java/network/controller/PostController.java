package network.controller;

import network.model.Post;
import network.service.PostService;

public class PostController {
    public static void main(String[] args) {

        final PostService postService = new PostService();
        final Post[] posts = postService.getAll();
        for (Post elems : posts) {
            System.out.println(elems);

        }

    }
}