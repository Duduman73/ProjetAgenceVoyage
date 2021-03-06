package com.adaming.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class HotelBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String city;
	
	 @PostConstruct
	    public void init() {	
		city = (String) FacesContext.getCurrentInstance().getExternalContext()
				.getFlash().get("ville");
		//System.out.println(city);
	 }
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}