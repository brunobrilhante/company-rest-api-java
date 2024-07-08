package com.company.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
