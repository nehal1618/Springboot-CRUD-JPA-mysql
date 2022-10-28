package com.example.springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootproject.entites.Book;
import com.example.springbootproject.service.Service;

@RestController
public class Controller {

	@Autowired
	private Service service;

	@GetMapping("/book")
	public List<Book> Books() {
		return service.getAlltBooks();
	}

	@GetMapping("/book/{id}")
	public Book getbookById(@PathVariable int id) {
		return service.getbookById(id);

	}

	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
	}

	@PutMapping("/book/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable int id) {
		Book updatedbook = service.updateBook(book, id);
		 return updatedbook;
	}

	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable int id) {
		 service.deleteBookById(id);
		 return "Book deleted successfully";
	}

	@DeleteMapping("/book")
	public String deleteAllBooks() {
		return service.deleteAllBooks();
	}

}
