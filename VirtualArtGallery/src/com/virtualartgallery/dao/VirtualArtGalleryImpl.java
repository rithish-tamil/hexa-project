package com.virtualartgallery.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.virtualartgallery.model.Artwork;
import com.virtualartgallery.util.DbConnectionUtil;

public class VirtualArtGalleryImpl implements IVirtualArtGallery {

	Connection connection;

	public void addArtwork(Artwork artwork) {

		connection = DbConnectionUtil.getConnection();

		String sql = "insert into artwork values(?,?,?,?,?,?)";

		PreparedStatement statement = null;

		try {

			statement = connection.prepareStatement(sql);
			statement.setInt(1, artwork.getArtworkId());
			statement.setString(2, artwork.getTitle());
			statement.setString(3, artwork.getDescription());
			statement.setString(4, artwork.getCreationDate());
			statement.setString(5, artwork.getMedium());
			statement.setString(6, artwork.getImageURL());

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

	@Override
	public void updateArtwork(String medium, int artworkId) {
		connection = DbConnectionUtil.getConnection();

		String sql = "update artwork set medium =? where artwork_id=? ";

		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);

			statement.setString(1, medium);
			statement.setInt(2, artworkId);

			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}

		}
	}

	@Override
	public void removeArtwork(int artworkId) {
		{
			connection = DbConnectionUtil.getConnection();

			String sql = "delete from artwork where artwork_id=? ";

			PreparedStatement statement = null;

			try {
				statement = connection.prepareStatement(sql);

				statement.setInt(1, artworkId);

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

	}

	public List<Artwork> getAllArtwork() {

		connection = DbConnectionUtil.getConnection();

		String sql = "select * from artwork";

		PreparedStatement statement = null;

		List<Artwork> artworks = new ArrayList<Artwork>();

		try {
			statement = connection.prepareStatement(sql);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				int artworkId = rs.getInt("artwork_id");
				String bookId = rs.getString("title");
				String description = rs.getString("description");
				String creationDate = rs.getString("creation_date");
				String medium = rs.getString("medium");
				String imageURL = rs.getString("image_url");
				Artwork artworkk = new Artwork(artworkId, bookId, description, creationDate, medium, imageURL);
				artworks.add(artworkk);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		}

		return artworks;
	}

	@Override
	public Artwork getArtworkById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void searchArtwork(int artworkId, String medium) {
		// TODO Auto-generated method stub

	}

}
