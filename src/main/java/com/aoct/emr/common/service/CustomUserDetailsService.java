package com.aoct.emr.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.aoct.emr.common.entity.UserModel;
import com.aoct.emr.common.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username)  {
		// TODO Auto-generated method stub
		UserModel user = repo.findByEmail(username).orElseThrow((()-> new RuntimeException("nahi hai user")));
		return user;
	}


}
