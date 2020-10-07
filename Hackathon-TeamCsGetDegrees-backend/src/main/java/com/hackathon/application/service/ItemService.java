package com.hackathon.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hackathon.application.model.Item;

@Service
public interface ItemService {
	public void addItem(Item i);
	public List<Item> findAll();
	
}
