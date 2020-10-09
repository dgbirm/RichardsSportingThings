
package com.hackathon.application.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.application.model.Item;
import com.hackathon.application.model.ItemTag;
import com.hackathon.application.model.Tag;
import com.hackathon.application.service.ItemService;
import com.hackathon.application.service.ItemTagService;
import com.hackathon.application.service.TagService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/")
public class ItemTagController {
	
	@Autowired
	private ItemTagService service;
	@Autowired
	private ItemService itemservice;
	
	@Autowired
	private TagService tagservice;
	
	@GetMapping("/allTags")
	public List<Tag> getTags(){
		List <Tag> tags = tagservice.findAll();

		return tags;
		
	}
	
	@GetMapping("/items")
	public List<Item> getItems(){
		List <Item> items = itemservice.findAll();

		return items;
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/tagitems")
	public List<Item> getTagItems(@RequestBody List<Tag> tags) {

		List<Integer> foundIds = new ArrayList();
		List<Item> finalItems = new ArrayList();
		List <Item> items = itemservice.findAll();
		List <ItemTag> itemTags = service.findAll();
		List<Tag> tagsList = tagservice.findAll();
		
		Map<Integer, Tag> tagMap = new HashMap();
		
		for(Tag i: tagsList) {
			tagMap.put(i.getTagId(), i);
		}
		
		int level = tags.get(0).getLevel();
		String precede = tags.get(0).getPrecedingNode();
		System.out.println(tags.get(0).getIsFinal());
		int count1 = 0;
		int max = tags.size()-1;
		if(tags.get(0).getIsFinal() != 1) {
		while (count1 <= max ) {
		for(Tag tag: tags) {
			for(ItemTag i: itemTags) {
				if(tag.getTagId()== i.getTagId() && tag.getLevel() >= level && tags.get(count1).getPrecedingNode() == tag.getPrecedingNode()) {
					foundIds.add(i.getItemId());
					

				}
			}
		count1++;
		}
		}
		System.out.println("");
		for(int i: foundIds) {
			System.out.println(i);
			for(Item item: items) {
				if(item.getItemId() == i) {
					
					finalItems.add(item);
					
				}
			}
		}
		
		
		List<Item> reducedItems = new ArrayList();
		int count = 0;
		for(Item i: finalItems) {
		
				if(i.getSpecialKey()!= null) {
					reducedItems.add(i);
				}

		}
		
		if(reducedItems.size() >= 3) {
			return reducedItems.subList(0, 3);
		}
		else if(finalItems.size()>= 3) {
			
	
				return finalItems.subList(0, 3);
			
			
		}
		}
		else  {
			System.out.println("In the else");
			System.out.println(tags.get(0).getTagId());
			String precedingNode = tags.get(0).getPrecedingNode();
			for(ItemTag i: itemTags) {
				if(i.getTagId() == tags.get(0).getTagId() && tagMap.get(i.getTagId()).getPrecedingNode().equals(precedingNode) ){
					foundIds.add(i.getItemId());
				}
			}
			
			for(int i: foundIds) {
				System.out.println(i);
				for(Item item: items) {
					if(item.getItemId() == i) {
						
						finalItems.add(item);
						
					}
				}
			}
			
			return(finalItems);
		}
		
		return new ArrayList<Item>();
	


		
	}

}
