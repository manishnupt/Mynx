package com.aoct.emr.login.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class userLoginEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String email;
	private String pwd;
	private String role;
	
}
