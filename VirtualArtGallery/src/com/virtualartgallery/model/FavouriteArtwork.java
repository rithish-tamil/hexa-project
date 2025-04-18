package com.virtualartgallery.model;

public class FavouriteArtwork {
	
	User userId;
	Artwork artworkId;
	public FavouriteArtwork(User userId, Artwork artworkId) {
		super();
		this.userId = userId;
		this.artworkId = artworkId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public Artwork getArtworkId() {
		return artworkId;
	}
	public void setArtworkId(Artwork artworkId) {
		this.artworkId = artworkId;
	}
	@Override
	public String toString() {
		return "FavouriteArtwork [userId=" + userId + ", artworkId=" + artworkId + "]";
	}
	
	

}
