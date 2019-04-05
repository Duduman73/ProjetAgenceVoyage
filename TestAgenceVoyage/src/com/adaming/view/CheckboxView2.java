package com.adaming.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxView2 {

	private String[] selectedObject;
	private List<String> object;
	
	@PostConstruct
	public void init() {
	    object = new ArrayList<String>();
	    object.add("1");
	    object.add("2");
	    object.add("3");
	    object.add("4");
	    object.add("5");
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
	 
	 private String[] selectedRoom;
		private List<String> room;
		@PostConstruct
		public void init1() {
			room = new ArrayList<String>();
			room.add("0");
			room.add("1");
			room.add("2");
			room.add("3");
			room.add("4");
			room.add("5");
		}
		
		public String[] getSelectedRoom() {
		    return selectedRoom;
		}
		 public void setSelectedRoom(String[] selectedRoom) {
		        this.selectedRoom = selectedRoom;
		    }
		 public List<String> getRoom() {
			    return room;
			}
		 
		 
}
