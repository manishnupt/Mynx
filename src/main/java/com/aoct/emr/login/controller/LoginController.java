package com.aoct.emr.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

import com.aoct.emr.login.entity.userLoginEntity;
import com.aoct.emr.login.repo.userLoginRepo;

@RestController
public class LoginController {
	
    @Autowired
    private userLoginRepo userLoginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
	
	@RequestMapping("/user")
    public userLoginEntity getUserDetailsAfterLogin(Authentication authentication) {
        List<userLoginEntity> customers = userLoginRepository.findByEmail(authentication.getName());
        if (customers.size() > 0) {
            return customers.get(0);
        } else {
            return null;
        }

    }

}
