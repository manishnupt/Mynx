package com.aoct.emr.login.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class userLoginEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	private String role;
	private boolean checkbox;
	@Column(name = "create_dt")
    private String createDt;

	
}
