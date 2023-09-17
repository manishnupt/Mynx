package com.aoct.emr.common.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="RefreshToken")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefreshToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int refreshTokenId;
	private String refreshToken;
	private Instant expiry;
	
	@OneToOne
	private UserModel user;
	

}