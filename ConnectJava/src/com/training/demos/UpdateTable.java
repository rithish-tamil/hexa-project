package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hexadb";
		String username = "root";
		String password = "Rithish@87";
		String sql = "update student set department=? where student_id=? ";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, "MECH");
			statement.setInt(2, 3);
			
			int result = statement.executeUpdate();
			System.out.println(result);

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
