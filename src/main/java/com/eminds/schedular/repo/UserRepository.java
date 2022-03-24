package com.eminds.schedular.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eminds.schedular.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>  {
	
	
	

}
