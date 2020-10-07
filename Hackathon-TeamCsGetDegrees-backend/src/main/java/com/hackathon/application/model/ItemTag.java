package com.hackathon.application.model;

import javax.persistence.Entity;

@Entity
public class ItemTag {
private int itemId;
private int tagId;


public ItemTag() {
	super();
	// TODO Auto-generated constructor stub
}

public ItemTag(int itemId, int tagId) {
	super();
	this.itemId = itemId;
	this.tagId = tagId;
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
	return "ItemTag [itemId=" + itemId + ", tagId=" + tagId + "]";
}

}
