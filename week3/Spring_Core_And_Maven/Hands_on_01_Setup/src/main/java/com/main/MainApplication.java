package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.BookService;
public class MainApplication {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bookservice=context.getBean("serv",BookService.class);
		bookservice.service();
	}
}
