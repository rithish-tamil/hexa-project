package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hexadb";
		String username = "root";
		String password = "Rithish@87";
		String sql = "create table student(student_name varchar(20),student_id int primary key,department varchar(20))";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.prepareStatement(sql);
			boolean result = statement.execute();
			System.out.println("Table Created " + !result);
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
}