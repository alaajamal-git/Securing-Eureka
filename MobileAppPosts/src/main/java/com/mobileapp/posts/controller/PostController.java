package com.mobileapp.posts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileapp.posts.models.PostResponseModel;
import com.mobileapp.posts.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	PostService postservice;
	Environment env;
	@Autowired
	public PostController(PostService postservice,Environment env) {

		this.postservice=postservice;
		this.env=env;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<PostResponseModel>> getPosts(){
		List<PostResponseModel> posts=this.postservice.getPosts();
		
		return new ResponseEntity<List<PostResponseModel>>(posts,HttpStatus.OK);
	}
	@GetMapping("/status")
	public ResponseEntity<String> getStatus(){		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
