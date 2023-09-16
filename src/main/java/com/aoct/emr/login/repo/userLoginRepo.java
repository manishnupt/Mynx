package com.aoct.emr.login.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aoct.emr.login.entity.userLoginEntity;

@Repository
public interface userLoginRepo extends JpaRepository<userLoginEntity,Long>{
	
	List<userLoginEntity> findByUsername(String username);


}
