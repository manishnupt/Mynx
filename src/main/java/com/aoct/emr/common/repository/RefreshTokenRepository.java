package com.aoct.emr.common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aoct.emr.common.entity.RefreshToken;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Integer>{
	
	Optional<RefreshToken> findByRefreshToken(String refreshToken);
	
	

}
