package com.adaming.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxView3 {

	private String[] selectedMonth;
	private List<String> month;
	
	@PostConstruct
	public void init() {
		month = new ArrayList<String>();
	    month.add("Janvier");
	    month.add("Février");
	    month.add("Mars");
	    month.add("Avril");
	    month.add("Mai");
	    month.add("Juin");
	    month.add("Juillet");
	    month.add("Août");
	    month.add("Septembre");
	    month.add("Octobre");
	    month.add("Novembre");
	    month.add("Décembre");
	    
	}
	
	public String[] getSelectedMonth() {
	    return selectedMonth;
	}
	 public void setSelectedMonth(String[] selectedMonth) {
	        this.selectedMonth = selectedMonth;
	    }
	 public List<String> getMonth() {
		    return month;
		}
	 
	 private String[] selectedYear;
		private List<String> year;
		@PostConstruct
		public void init1() {
			year = new ArrayList<String>();
			year.add("2019");
			year.add("2020");
			year.add("2021");
			year.add("2022");
			year.add("2023");
			year.add("2024");
			year.add("2025");
			year.add("2026");
			year.add("2027");
		}
		
		public String[] getSelectedYear() {
		    return selectedYear;
		}
		 public void setSelectedYear(String[] selectedYear) {
		        this.selectedYear = selectedYear;
		    }
		 public List<String> getYear() {
			    return year;
			}
		 
		 
}
