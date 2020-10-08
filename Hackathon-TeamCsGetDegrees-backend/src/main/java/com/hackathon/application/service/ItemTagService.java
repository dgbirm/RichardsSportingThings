package com.hackathon.application.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hackathon.application.model.ItemTag;

@Service
public interface ItemTagService {
	
	public List<ItemTag> findAll();


}
