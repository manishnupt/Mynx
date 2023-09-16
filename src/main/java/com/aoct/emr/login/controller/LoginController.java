package com.aoct.emr.login.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody userLoginEntity customer) {
    	userLoginEntity savedCustomer = null;
        ResponseEntity response = null;
        try {
            String hashPwd = passwordEncoder.encode(customer.getPassword());
            customer.setPassword(hashPwd);
            customer.setCreateDt(String.valueOf(new Date(System.currentTimeMillis())));
            savedCustomer = userLoginRepository.save(customer);
            if (savedCustomer.getId() > 0) {
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        } catch (Exception ex) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + ex.getMessage());
        }
        return response;
    }
	
	@RequestMapping("/login")
    public userLoginEntity getUserDetailsAfterLogin(Authentication authentication) {
        List<userLoginEntity> customers = userLoginRepository.findByUsername(authentication.getName());
        if (customers.size() > 0) {
            return customers.get(0);
        } else {
            return null;
        }

    }

}
