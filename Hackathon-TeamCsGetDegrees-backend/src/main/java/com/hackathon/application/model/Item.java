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
private String description;
private double price;



public Item() {
	super();
}


public Item(int itemId, String itemName, String description, double price) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.description = description;
	this.price = price;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


@Override
public String toString() {
	return "Item [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", price=" + price
			+ "]";
}


}


