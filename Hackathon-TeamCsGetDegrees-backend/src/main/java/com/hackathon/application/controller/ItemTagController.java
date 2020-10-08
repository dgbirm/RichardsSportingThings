
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
		
		for(Tag tag: tags) {
			for(ItemTag i: itemTags ) {
				if(tag.getTagId()== i.getTagId()) {
					foundIds.add(i.getItemId());
					System.out.println();
					System.out.println("Item ID>>>");
					System.out.println(i.getItemId());
				}
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
			if(count <= 3) {
				if(specialKeys.contains(i.getSpecialKey())) {
					reducedItems.add(i);
				}
			}
		
		count++;
		}
		
		if(reducedItems.size() == 3) {
			return reducedItems;
		}
		else {
			
			if(finalItems.size()>= 4) {
				return finalItems.subList(0, 3);
			}
			
		}
		
		return new ArrayList<Item>();
	


		
		
	}

}
