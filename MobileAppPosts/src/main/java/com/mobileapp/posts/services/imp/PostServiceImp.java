package com.mobileapp.posts.services.imp;

import java.util.ArrayList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileapp.posts.datasource.PostEntity;
import com.mobileapp.posts.datasource.PostRepository;
import com.mobileapp.posts.models.PostResponseModel;
import com.mobileapp.posts.services.PostService;

@Service
public class PostServiceImp implements PostService{

	@Autowired
	PostRepository postrepo;
	
	
	
	@Override
	public ArrayList<PostResponseModel> getPosts() {
		
		ArrayList<PostEntity> myList1 = new ArrayList<>();
		ArrayList<PostResponseModel> myList2 = new ArrayList<>();
		postrepo.findAll().forEach(myList1::add);
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		myList2=mapper.map(myList1, new TypeToken<ArrayList<PostResponseModel>>() {}.getType());
		return myList2;
	}
	
	
	

}
