package com.hackathon.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tag {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int tagId;
private String tagName;
private int isFinal;
private int level;
private String precedingNode;


public Tag() {
	super();
}



public Tag(int tagId, String tagName, int isFinal, int level, String precedingNode) {
	super();
	this.tagId = tagId;
	this.tagName = tagName;
	this.isFinal = isFinal;
	this.level = level;
	this.precedingNode = precedingNode;
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


public int getLevel() {
	return level;
}

public void setLevel(int level) {
	this.level = level;
}

public String getPrecedingNode() {
	return precedingNode;
}

public void setPrecedingNode(String precedingNode) {
	this.precedingNode = precedingNode;
}



@Override
public String toString() {
	return "Tag [tagId=" + tagId + ", tagName=" + tagName + ", isFinal=" + isFinal + ", level=" + level
			+ ", precedingNode=" + precedingNode + "]";
}




}
