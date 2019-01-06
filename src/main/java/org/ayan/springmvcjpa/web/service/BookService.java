package org.ayan.springmvcjpa.web.service;

import java.util.List;
import java.util.Optional;

import org.ayan.springmvcjpa.web.model.Book;
import org.ayan.springmvcjpa.web.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BookService {

	@Autowired
	BookRepo bookRepo;

	public void persist(Book entity) {

		bookRepo.save(entity);

	}

	public void update(Book entity) {

		bookRepo.save(entity);

	}

	public Optional<Book> findById(String id) {
		//return null;

		Optional<Book> book = bookRepo.findById(id);

		return book;
	}

	public List<Book> findByTitle(String title) {
		
		List<Book> books = bookRepo.findByTitle(title);

		return books;

	}

	public void delete(String id) {

		bookRepo.deleteById(id);

	}

	public List<Book> findAll() {
		//return null;

		List<Book> books = (List<Book>) bookRepo.findAll();
		System.out.println(books.toString());

		return books;
	}

	public void deleteAll() {

		bookRepo.deleteAll();

	}

}
