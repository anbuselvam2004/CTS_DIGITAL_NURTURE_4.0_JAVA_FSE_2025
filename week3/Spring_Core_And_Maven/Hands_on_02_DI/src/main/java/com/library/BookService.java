package com.library;
import com.library.BookRepository;
public class BookService {
	private BookRepository bookrepository;
	public void setBookrepository(BookRepository bookrepository) {
		this.bookrepository=bookrepository;
	}
	public void addBook(String bname) {
		System.out.println("Adding book: "+bname);
		bookrepository.BookSave(bname);
		bookrepository.storeOnDB(bname);
	}
	public void show() {
		bookrepository.display();
	}
}
