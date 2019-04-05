package com.adaming.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="formulaire3")
@SessionScoped
public class FContactBean3 implements Serializable{
	
		
	private static final long serialVersionUID = 1L;
		String nom;
		int nbCarte;
		int crypto;
		String message;
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getNbCarte() {
			return nbCarte;
		}
		public void setNbCarte(int nbCarte) {
			this.nbCarte = nbCarte;
		}
		public int getCrypto() {
			return crypto;
		}
		public void setCrypto(int crypto) {
			this.crypto = crypto;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}


}
