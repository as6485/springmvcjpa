package org.ayan.springmvcjpa.web.repo;

import java.util.List;

import org.ayan.springmvcjpa.web.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, String> {
	List<Book> findByTitle(String title);
}
