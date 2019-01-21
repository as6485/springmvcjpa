package springmvcjpa;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.ayan.springmvcjpa.web.model.Book;
import org.ayan.springmvcjpa.web.repo.BookRepo;
import org.ayan.springmvcjpa.web.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestService {

	@Mock
	BookService bookService;

	@Mock
	List<Book> books;

	@Mock
	Book book;

	@Test
	public void findBookByTitle() {
		book.setId("123");
		book.setTitle("Mowghli");
		books.add(book);
		Mockito.when(book.getTitle()).thenReturn("Mowghli");
		Mockito.when(books.get(0)).thenReturn(book);
		Mockito.when(bookService.findByTitle("Mowghli")).thenReturn(books);
		assertEquals("Mowghli", bookService.findByTitle("Mowghli").get(0).getTitle());

	}

}
