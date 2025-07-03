package com.library;
import com.library.Book;
import java.util.List;
public class LibraryService {
	 private BookRepository bookRepository;

	    public void setBookRepository(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	    public void displayAllBooks() {
	        List<Book> books = bookRepository.findAllBooks();
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
}
