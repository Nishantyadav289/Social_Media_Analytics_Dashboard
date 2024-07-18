package com.app.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dashboard.dao.PostRepository;
import com.app.dashboard.pojo.Post;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public List<Post> getAllPosts() {
		System.out.println("PostService.getAllPosts()");
		return postRepository.findAll();
	}

	public List<Post> getPostsByUserId(Long userId) {
		System.out.println("PostService.getPostsByUserId()");
		return postRepository.findByUserId(userId);
	}

	public Post createPost(Post post) {
		System.out.println("PostService.createPost()");
		return postRepository.save(post);
	}

	public void deletePost(Long id) {
		System.out.println("PostService.deletePost()");
		postRepository.deleteById(id);
	}

}
