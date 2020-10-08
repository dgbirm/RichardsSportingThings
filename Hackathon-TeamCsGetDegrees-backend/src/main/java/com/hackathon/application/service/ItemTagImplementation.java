package com.hackathon.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.application.model.ItemTag;
import com.hackathon.application.repository.ItemRepository;
import com.hackathon.application.repository.ItemTagRepository;

@Service
public class ItemTagImplementation implements ItemTagService{

	
	@Autowired
	private ItemTagRepository itemRepo;

	
	@Override
	public List<ItemTag> findAll() {
		return itemRepo.findAll();
	}
	
}


	
	
