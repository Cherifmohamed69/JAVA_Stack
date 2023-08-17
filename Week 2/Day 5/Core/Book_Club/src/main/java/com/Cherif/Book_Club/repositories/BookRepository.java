package com.Cherif.Book_Club.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Cherif.Book_Club.models.Book;


public interface BookRepository extends CrudRepository<Book, Long> {
	
	// Read All
			List<Book> findAll();

}