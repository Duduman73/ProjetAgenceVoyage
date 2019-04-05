package com.adaming.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxView {

	private String[] selectedObject;
	private List<String> object;
	
	@PostConstruct
	public void init() {
	    object = new ArrayList<String>();
	    object.add("Demander un devis");
	    object.add("Prendre un rendez-vous");
	    object.add("Des questions sur votre réservation");
	    object.add("modifier ou supprimer une réservation");
	    object.add("Recrutement");
	    object.add("Une autre demande");
	}
	
	public String[] getSelectedObject() {
	    return selectedObject;
	}
	 public void setSelectedObject(String[] selectedObject) {
	        this.selectedObject = selectedObject;
	    }
	 public List<String> getObject() {
		    return object;
		}
}
