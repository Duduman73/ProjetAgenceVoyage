package com.adaming.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="receipt")
@SessionScoped
public class ContactBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	Date date;
	String nom;
	String prenom;
	String email;
	String message;
	

	public Date getDate() {
		return date;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getEmail() {
		return email;
	}
	public String getMessage() {
		return message;
	}

	
	public void setDate(Date date) {
		this.date = date;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}


	
 
  
 
   
 
   
 
  






     







