package com.library;


import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public List<Book> findAllBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Spring in Action"));
        books.add(new Book(2, "Effective Java"));
        return books;
    }
}