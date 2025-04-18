package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hexadb";
		String username = "root";
		String password = "Rithish@87";
		
		String sql = "insert into student values(?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, "Gandhi");
			statement.setInt(2, 7);
			statement.setString(3, "ECE");
			
			statement.setString(1, "Kishore");
			statement.setInt(2, 9);
			statement.setString(3, "CYS");
			
			boolean result = statement.execute();
			System.out.println("Table Inserted " + !result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		

	}

}}
