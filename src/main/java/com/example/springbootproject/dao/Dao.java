package com.example.springbootproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootproject.entites.Book;

public interface Dao extends CrudRepository<Book,Integer> {

	public Book findById(int id);
	
}
