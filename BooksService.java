package com.crudoperation.service;

import com.crudoperation.model.Books;
import com.crudoperation.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {

	@Autowired
	BooksRepository booksRepository;

	public List<Books> getAllBook() {
		List<Books> books = new ArrayList<>();
		booksRepository.findAll().forEach(books::add);
		return books;
	}

	public Books getBookById(int id) {

		return booksRepository.findById(id).get();

	}

	public Books saveOrUpdateBook(Books books) {

		return booksRepository.save(books);

	}

	public void deleteBook(int id) {

		booksRepository.deleteById(id);
	}
	public void update(Books books, int bookid)
	{
		booksRepository.save(books);
	}


}
