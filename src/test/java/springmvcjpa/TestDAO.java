package springmvcjpa;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.ayan.springmvcjpa.web.model.Book;
import org.ayan.springmvcjpa.web.repo.BookRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestDAO {

	@Mock
	BookRepo bookRepo;
	
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
		Mockito.when(bookRepo.findByTitle("Mowghli")).thenReturn(books);
		assertEquals("Mowghli", bookRepo.findByTitle("Mowghli").get(0).getTitle());
		
		
		
	}
	
}
