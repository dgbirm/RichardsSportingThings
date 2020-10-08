
package com.hackathon.application.controller;

import java.util.ArrayList;
import java.util.List;

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
	

	@PostMapping("/tagitems")
	public List<Item> getTagItems(@RequestBody List<Tag> tags) {
		
		List<Integer> foundIds = new ArrayList();
		List<Item> finalItems = new ArrayList();
		List <Item> items = itemservice.findAll();
		List <ItemTag> itemTags = service.findAll();
		
		int level = tags.get(0).getLevel();
		String precede = tags.get(0).getPrecedingNode();
		System.out.println("Level to compare to = " + level);
		System.out.println("Tag NAME");
		System.out.println(tags.get(0).getTagName());
		System.out.println("PReceding node of tag entered: " + precede);
		int count1 = 0;
		int max = tags.size()-1;
		while (count1 <= max ) {
		for(Tag tag: tags) {
			for(ItemTag i: itemTags) {
				if(tag.getTagId()== i.getTagId() && tag.getLevel() >= level && tags.get(count1).getPrecedingNode() == tag.getPrecedingNode()) {
					foundIds.add(i.getItemId());
					System.out.println("Name" + tag.getTagName());
					System.out.println("TagID:  "  + tag.getTagId());
					System.out.println("Level >>>" + tag.getLevel());
					System.out.println();
					System.out.println("Item ID>>>");
					System.out.println(i.getItemId());
				}
			}
		count1++;
		}
		}
		System.out.println("");
		for(int i: foundIds) {
			for(Item item: items) {
				if(item.getItemId() == i) {
					finalItems.add(item);
					System.out.println();
					System.out.println("Item>>>");
					System.out.println(item.toString());
				}
			}
		}
		
		//Adding special Keys 
		List<String> specialKeys = new ArrayList();
		specialKeys.add("DicksExclusive");
		specialKeys.add("ExtendedSized");
		specialKeys.add("TopSeller");
		specialKeys.add("NewArrivals");
		
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
		else {
			
			if(finalItems.size()>= 4) {
				return finalItems.subList(0, 3);
			}
			
		}
		
		return new ArrayList<Item>();
	


		
		
	}

}
