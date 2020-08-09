package com.mobileapp.posts.services;

import java.util.ArrayList;

import com.mobileapp.posts.models.PostResponseModel;

public interface PostService {
	
	ArrayList<PostResponseModel> getPosts();

}
