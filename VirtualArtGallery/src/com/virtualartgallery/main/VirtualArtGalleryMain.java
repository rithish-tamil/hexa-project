package com.virtualartgallery.main;

import java.util.List;

import com.virtualartgallery.dao.IVirtualArtGallery;
import com.virtualartgallery.dao.VirtualArtGalleryImpl;
import com.virtualartgallery.model.Artwork;

public class VirtualArtGalleryMain {

	public static void main(String[] args) {
		
		Artwork artwork = new Artwork(1,"Monalisa","Mysterious Smile","1503-07-07","Oil on Wood","https://example.com/monalisa.jpg");
		Artwork artwork1 = new Artwork(2, "Starry Night", "Swirling night sky", "1889-04-07", "Oil on Canvas", "https://example.com/starry-night.jpg");
		Artwork artwork2 = new Artwork(3, "The Persistence of Memory", "Melting clocks in a desert", "1931-05-10", "Oil on Canvas", "https://example.com/melting-clocks.jpg");
		Artwork artwork3 = new Artwork(4, "Girl with a Pearl Earring", "Mysterious girl with a pearl earring", "1665-06-11", "Oil on Canvas", "https://example.com/pearl-earring.jpg");
		Artwork artwork4 = new Artwork(5, "The Scream", "Figure screaming under a blood-red sky", "1893-08-09", "Tempera on Cardboard", "https://example.com/the-scream.jpg");

        
        IVirtualArtGallery artgallery = new  VirtualArtGalleryImpl();
        artgallery.addArtwork(artwork);  
        artgallery.addArtwork(artwork1);
        artgallery.addArtwork(artwork2);
        artgallery.addArtwork(artwork3);
        artgallery.addArtwork(artwork4);
        
        artgallery.updateArtwork("Oil on wood", 3);
        
        artgallery.removeArtwork(3);
        
        
        
        List<Artwork> artworrk = artgallery.getAllArtwork(); 
        for(Artwork artworkn : artworrk ) {
        	System.out.println(artworkn);
        }
	}
}



