package com.adaming.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ImagesView {
     
	private List<String> images;
    
    @PostConstruct
    public void init() {
    	images = new ArrayList<String>();
        
            images.add("Lyon.jpg" );
            images.add("Marseille.jpg");
            images.add("Paris.jpg");
            images.add("Barcelone.jpg");
            images.add("Madrid.jpg");
            images.add("Rome.jpg" );
            images.add("Florence.jpg");
            images.add("Naples.jpg");
            images.add("Athènes.jpg");
            images.add("Thessalonique.jpg");
            images.add("Split.jpg");
            images.add("Dubrovnik.jpg");
        }
    
    public List<String> getImages() {
        return images;
    }
}
