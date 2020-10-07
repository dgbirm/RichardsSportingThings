package com.hackathon.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemTag {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int itemTagId;
private int itemId;
private int tagId;


public ItemTag() {
	super();
	// TODO Auto-generated constructor stub
}



public ItemTag(int itemTagId, int itemId, int tagId) {
	super();
	this.itemTagId = itemTagId;
	this.itemId = itemId;
	this.tagId = tagId;
}



public int getItemTagId() {
	return itemTagId;
}



public void setItemTagId(int itemTagId) {
	this.itemTagId = itemTagId;
}



public int getItemId() {
	return itemId;
}

public void setItemId(int itemId) {
	this.itemId = itemId;
}

public int getTagId() {
	return tagId;
}

public void setTagId(int tagId) {
	this.tagId = tagId;
}



@Override
public String toString() {
	return "ItemTag [itemTagId=" + itemTagId + ", itemId=" + itemId + ", tagId=" + tagId + "]";
}



}
