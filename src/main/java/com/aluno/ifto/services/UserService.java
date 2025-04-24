package com.aluno.ifto.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.ifto.domain.User;
import com.aluno.ifto.repository.UserRepository;
import com.aluno.ifto.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();

	}
	
	public User findById(String id) {
	    return repo.findById(id)
	        .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
