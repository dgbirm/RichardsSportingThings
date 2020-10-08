
package com.hackathon.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.application.model.Item;
import com.hackathon.application.model.ItemTag;
import com.hackathon.application.model.Tag;
import com.hackathon.application.service.ItemService;
import com.hackathon.application.service.ItemTagService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/")
public class ItemTagController {
	
	@Autowired
	private ItemTagService service;
	private ItemService itemservice;
	
	
	
	@GetMapping("/tagitems")
	public List<Item> getTagItems(@RequestBody List<Tag> tags) {
		
		List<Integer> foundIds = new ArrayList();
		List<Item> finalItems = new ArrayList();
		List <Item> items = itemservice.findAll();
		List <ItemTag> itemTags = service.findAll();
		
		for(Tag tag: tags) {
			for(ItemTag i: itemTags ) {
				if(tag.getTagId()== i.getTagId()) {
					foundIds.add(i.getItemId());
				}
			}
		}
		
		for(int i: foundIds) {
			for(Item item: items) {
				if(item.getItemId() == i) {
					finalItems.add(item);
				}
			}
		}
		
		
	

		return finalItems;
		
	}

}
