package com.hackathon.application.model;

import java.util.ArrayList;

public class ItemLists {
	
	private ArrayList<Tag> tags;
	private ArrayList<Item> items;
	
	
	public ItemLists(ArrayList<Tag> tags, ArrayList<Item> items) {
		super();
		this.tags = tags;
		this.items = items;
	}


	public ArrayList<Tag> getTags() {
		return tags;
	}


	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}


	public ArrayList<Item> getItems() {
		return items;
	}


	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	
	
	
}
