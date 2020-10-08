package com.hackathon.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hackathon.application.model.Tag;

@Service
public interface TagService {

	public void addTag(Tag t);
	public List<Tag> findAll();
	public Tag findById(int id);
	public Tag findByName(String name);
}
