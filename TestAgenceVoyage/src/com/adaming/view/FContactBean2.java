package com.adaming.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="formulaire2")
@SessionScoped
public class FContactBean2 implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
		int jour;
		int nuit;
		
		
		public int getJour() {
			return jour;
		}
		public void setJour(int jour) {
			this.jour = jour;
		}
		public int getNuit() {
			return nuit;
		}
		public void setNuit(int nuit) {
			this.nuit = nuit;
		}
		
		
		
		

}
