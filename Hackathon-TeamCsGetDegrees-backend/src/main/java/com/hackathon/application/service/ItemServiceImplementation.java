package com.hackathon.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.application.model.Item;
import com.hackathon.application.repository.ItemRepository;

@Service
public class ItemServiceImplementation implements ItemService {

	@Autowired
	private ItemRepository itemRepo;

	@Override
	public void addItem(Item i) {
		itemRepo.save(i);
		
	}

	@Override
	public List<Item> findAll() {
		return itemRepo.findAll();
	}
	
	
}
