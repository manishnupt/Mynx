package com.aoct.emr.common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aoct.emr.common.entity.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
	public Optional<UserModel> findByEmail(String email);


}
