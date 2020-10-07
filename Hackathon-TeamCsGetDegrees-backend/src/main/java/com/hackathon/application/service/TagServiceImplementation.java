package com.hackathon.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.application.model.Tag;
import com.hackathon.application.repository.TagRepository;

@Service
public class TagServiceImplementation implements TagService {

	@Autowired
	private TagRepository tagRepo;
	
	@Override
	public void addTag(Tag t) {
		tagRepo.save(t);
	}

	@Override
	public List<Tag> findAll() {
		return tagRepo.findAll();
	}

	@Override
	public Tag findById(int id) {
		List<Tag> all = tagRepo.findAll();;
		for(int i=0;i<all.size();i++) {
			if(all.get(i).getTagId()==id) {
				return all.get(i);
			}
		}
		return null;
		
	}

}
