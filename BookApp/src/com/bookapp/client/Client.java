package com.bookapp.client;

import com.bookapp.model.Book;

import java.util.List;

import com.bookapp.dao.*;

public class Client {

	public static void main(String[] args) {
		Book book = new Book("Rose","James","Romance",3,500);
        
        System.out.println(book);
        
        IBookDao bookDao=new BookDaoImpl();
		bookDao.addBook(book);

        
        List<Book> book1 = bookDao.getAllBooks(); 
        for(Book bookn : book1 ) {
        	System.out.println(bookn);
        }
        
	}

}
