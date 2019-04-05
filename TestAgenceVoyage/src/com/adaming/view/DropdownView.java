package com.adaming.view;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@ViewScoped
public class DropdownView implements Serializable {
	
	private static final long serialVersionUID = 1L;
     
    private Map<String,Map<String,String>> data = new HashMap<String, Map<String,String>>();
    private String country;  
    private String city;
    private Map<String,String> countries;
    private Map<String,String> cities;
    private String selectedCity;
     
    @PostConstruct
    public void init() {	
        countries  = new HashMap<String, String>();
        countries.put("France", "France");
        countries.put("Espagne", "Espagne");
        countries.put("Italie", "Italie");
        countries.put("Grèce", "Grèce");
        countries.put("Croatie", "Croatie");
         
        Map<String,String> map = new HashMap<String, String>();
        map.put("Paris", "Paris");
        map.put("Lyon", "Lyon");
        map.put("Marseille", "Marseille");
        data.put("France", map);
         
        map = new HashMap<String, String>();
        map.put("Madrid", "Madrid");
        map.put("Barcelone", "Barcelone");
        data.put("Espagne", map);
         
        map = new HashMap<String, String>();
        map.put("Rome", "Rome");
        map.put("Florence", "Florence");
        map.put("Naples", "Naples");
        data.put("Italie", map);
        
        map = new HashMap<String, String>();
        map.put("Athènes", "Athènes");
        map.put("Thessalonique", "Thessalonique");
        data.put("Grèce", map);
        
        map = new HashMap<String, String>();
        map.put("Dubrovnik", "Dubrovnik");
        map.put("Split", "Split");
        data.put("Croatie", map);
    }
 
    public Map<String, Map<String, String>> getData() {
        return data;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public Map<String, String> getCountries() {
        return countries;
    }
 
    public Map<String, String> getCities() {
        return cities;
    }
 
    public void onCountryChange() {
        if(country !=null && !country.equals(""))
            cities = data.get(country);
        else
            cities = new HashMap<String, String>();
    }

    public void displayLocation() {
        FacesMessage msg;
        if(city != null && country != null)
            msg = new FacesMessage("Vous avez sélectionné", city + ", " + country);
        else
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "City is not selected."); 
             
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
    
   public String getSelectedCity() {
		return selectedCity;
	}

	public void setSelectedCity(String selectedCity) {
		this.selectedCity = selectedCity;
	}

	public String validationVille(){
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("ville", city);
    	return "hotels";
    
    }
}