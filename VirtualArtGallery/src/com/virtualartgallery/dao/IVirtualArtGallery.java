package com.virtualartgallery.dao;

import java.util.List;

import com.virtualartgallery.model.Artwork;

public interface IVirtualArtGallery {
	
	void addArtwork(Artwork artwork);
	void updateArtwork(String medium,int arworkId);
	void removeArtwork(int artworkId);
	List<Artwork> getAllArtwork();
	
	Artwork getArtworkById();
	
	void searchArtwork(int artworkId,String medium);
	
	

}
