package com.insurance.dao;

import com.insurance.model.Policy;
import com.insurance.util.DbConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PolicyDaoImpl implements IPolicyDao {

	Connection connection;

	public void addPolicy(Policy policy) {
		connection = DbConnectionUtil.getConnection();
		String sql = "insert into policy values (?, ?, ?, ?, ?)";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, policy.getPolicyId());
			statement.setString(2, policy.getPolicyName());
			statement.setString(3, policy.getType());
			statement.setInt(4, policy.getDuration());
			statement.setDouble(5, policy.getPremium());
			statement.executeUpdate();
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

	public void updatePolicy(int policyId, double premium) {

	}

	public boolean deletePolicy(int policyId) {
		connection = DbConnectionUtil.getConnection();
		String sql = "delete from policy where policy_id = ?";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, policyId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		}
		return true;
	}

	public Policy getById(int policyId) {
		return null;
	}

	public List<Policy> getAllPolicies() {

		connection = DbConnectionUtil.getConnection();
		String sql = "select * from policy";

		List<Policy> list = new ArrayList<>();

		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int policyId = rs.getInt("policy_id");
				String policyName = rs.getString("policy_name");
				String type = rs.getString("type");
				int duration = rs.getInt("duration");
				double premium = rs.getDouble("premium");

				Policy policy = new Policy(policyId, policyName, type, duration, premium);
				System.out.println(policy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Policy getPolicy(int policyId) {
		// TODO Auto-generated method stub
		return null;
	}

}
