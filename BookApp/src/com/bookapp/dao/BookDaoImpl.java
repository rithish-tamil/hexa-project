package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bookapp.model.Book;
import com.bookapp.util.DbConnectionUtil;

public class BookDaoImpl implements IBookDao {
	static Connection connection;

	public void addBook(Book book) {
		
		connection = DbConnectionUtil.getConnection();

		String sql = "insert into book vlaues(?,?,?,?,?)";
		
		PreparedStatement statement = null;

		try {

			statement = connection.prepareStatement(sql);
			statement.setString(1, book.getTitle());
			statement.setInt(2, book.getBookId());
			statement.setString(3, book.getAuthour());			
			statement.setString(4, book.getCategory());
			statement.setDouble(5, book.getPrice());
			
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		}
	}

	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub

	}

	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub

	}

	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> getAllBooks() {
		
		connection = DbConnectionUtil.getConnection();

		String sql = "select * from books";
		
		PreparedStatement statement = null;
		
		List<Book> books = new ArrayList<Book>();
		
        try {
			statement = connection.prepareStatement(sql);
			
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				String title = rs.getString("title");
				int bookId = rs.getInt("book_id");
				String authour = rs.getString("authour");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				Book book = new Book(title,category,authour,bookId,price);
				books.add(book);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		}
		
		return books;
	}

	public List<Book> getByAuthour(String authour) {
		// TODO Auto-generated method stub
		return null;
	}

}
