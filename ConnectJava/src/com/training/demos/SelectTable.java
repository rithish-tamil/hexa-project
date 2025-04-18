package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hexadb";
		String username = "root";
		String password = "Rithish@87";
		String sql = "select * from student";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.prepareStatement(sql);
			
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				String studentName = result.getString("student_name");
				int studentId = result.getInt("student_id");
				String department = result.getString(3);
				
				System.out.println(studentName+"\t"+studentId+"\t"+department);}
			}catch (SQLException e) {
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
