package com.aoct.emr.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.aoct.emr.common.entity.UserModel;
import com.aoct.emr.common.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository repo;
	
	@Autowired
	PasswordEncoder encoder;
	
	public UserService() {
		
	}
	
	public List<UserModel> getUsers()
	{
		return repo.findAll();
	}
	
	public UserModel createUser(UserModel user)
	{
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
}
