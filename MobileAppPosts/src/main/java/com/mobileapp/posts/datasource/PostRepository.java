package com.mobileapp.posts.datasource;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, BigInteger>{

	
	
}
