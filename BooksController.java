package com.crudoperation.controller;

import com.crudoperation.model.Books;
import com.crudoperation.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BooksController {
	@Autowired
	BooksService bookService;

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		return bookService.getAllBook();
	}

	@GetMapping("/book/{bookID}")
	public Books getBooksById(@PathVariable("bookId") int bookID) {
		return bookService.getBookById(bookID);
	}

	@DeleteMapping("/book/{bookID}")
	public void deleteBooks(@PathVariable("bookId") int bookID) {
		bookService.deleteBook(bookID);
	}

	@PostMapping("/books")
	public int saveBook(@RequestBody Books books) {
		bookService.saveOrUpdateBook(books);
		return books.getBookId();
	}

	@PutMapping("/books")
	public Books update(@RequestBody Books books) {
		bookService.saveOrUpdateBook(books);
		return books;
	}


}
