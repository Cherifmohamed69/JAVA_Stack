package com.Cherif.Book_Club.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.Cherif.Book_Club.models.User;


public interface UserRepository extends CrudRepository<User, Long> {
	
	// FIND USER BY EMAIL
    Optional<User> findByEmail(String email);


}