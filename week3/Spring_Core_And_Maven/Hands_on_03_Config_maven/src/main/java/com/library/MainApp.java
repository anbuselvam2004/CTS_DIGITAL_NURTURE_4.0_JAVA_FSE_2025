package com.library;
import com.library.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.LibraryService;
public class MainApp {
	 public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	        LibraryService libraryService = (LibraryService) context.getBean("libraryService");
	        libraryService.displayAllBooks();
	  }
}
