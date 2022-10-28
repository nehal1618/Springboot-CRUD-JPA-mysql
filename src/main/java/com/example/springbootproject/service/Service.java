package com.example.springbootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springbootproject.dao.Dao;
import com.example.springbootproject.entites.Book;

@Component
public class Service {

	@Autowired
	private Dao dao;

	public List<Book> getAlltBooks() {

		List<Book> list = (List<Book>) dao.findAll();
		return list;
	}

	public Book getbookById(int id) {
		Book book = dao.findById(id);
		return book;
	}

	public Book addBook(Book book) {
		Book savedbook = dao.save(book);
		return savedbook;

	}

	public Book updateBook(Book book, int bookid) {
		book.setId(bookid);
		dao.save(book);
		return book;
	}

	public String deleteBookById(int id) {
		dao.deleteById(id);
		return "Book deleted successfully";
	}

	public String deleteAllBooks() {
		dao.deleteAll();
		return "All books deleted";
	}
}
