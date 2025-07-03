package com.library;
import java.util.ArrayList;

public class BookRepository {
	public ArrayList<String>books=new ArrayList<>();
	public void BookSave(String name) {
		System.out.println("Saving Book: "+name);
	}
	public void storeOnDB(String name) {
		books.add(name);
		System.out.println(name+" book is Stored on the Db");
	}
	public void display() {
		for(String s:books) {
			System.out.println(s);
		}
	}
}
