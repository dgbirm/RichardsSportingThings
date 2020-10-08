package com.hackathon.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int itemId;
private String itemName;
private String imageUrl;
private double price;
private String specialKey;



public Item() {
	super();
}


public Item(int itemId, String itemName, String imageUrl, double price, String specialKey) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.imageUrl = imageUrl;
	this.price = price;
	this.specialKey = specialKey;
}


public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


public String getImageUrl() {
	return imageUrl;
}


public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


public String getSpecialKey() {
	return specialKey;
}


public void setSpecialKey(String specialKey) {
	this.specialKey = specialKey;
}


@Override
public String toString() {
	return "Item [itemId=" + itemId + ", itemName=" + itemName + ", imageUrl=" + imageUrl + ", price=" + price
			+ ", specialKey=" + specialKey + "]";
}

}


