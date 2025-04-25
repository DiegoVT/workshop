package com.aluno.ifto.repository;



// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aluno.ifto.domain.Post;



@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	

}
