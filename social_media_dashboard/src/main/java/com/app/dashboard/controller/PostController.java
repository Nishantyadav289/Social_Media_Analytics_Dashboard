package com.app.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dashboard.pojo.Post;
import com.app.dashboard.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
    @Autowired 
    private PostService postService;
    
    @GetMapping
    public List<Post> getAllPosts() {
    	System.out.println("PostController.getAllPosts()");
        return postService.getAllPosts();
    }

    @GetMapping("/user/{userId}")
    public List<Post> getPostsByUserId(@PathVariable Long userId) {
    	System.out.println("PostController.getPostsByUserId()");
        return postService.getPostsByUserId(userId);
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
    	System.out.println("PostController.createPost()");
        return postService.createPost(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
    	System.out.println("PostController.deletePost()");
        postService.deletePost(id);
    }
    
}