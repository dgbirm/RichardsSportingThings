package com.hackathon.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {
	
@Id
@GeneratedValue
private int tagId;
private String tagName;
private int isFinal;



public Tag() {
	super();
}

public Tag(int tagId, String tagName, int isFinal) {
	super();
	this.tagId = tagId;
	this.tagName = tagName;
	this.isFinal = isFinal;
}

public int getTagId() {
	return tagId;
}

public void setTagId(int tagId) {
	this.tagId = tagId;
}

public String getTagName() {
	return tagName;
}

public void setTagName(String tagName) {
	this.tagName = tagName;
}

public int getIsFinal() {
	return isFinal;
}

public void setIsFinal(int isFinal) {
	this.isFinal = isFinal;
}

@Override
public String toString() {
	return "Tag [tagId=" + tagId + ", tagName=" + tagName + ", isFinal=" + isFinal + "]";
}



}
