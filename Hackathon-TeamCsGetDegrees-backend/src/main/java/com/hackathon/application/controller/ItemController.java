package com.hackathon.application.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.application.model.Tag;
import com.hackathon.application.repository.ItemRepository;
import com.hackathon.application.repository.TagRepository;
import com.hackathon.application.service.TagService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/")
public class ItemController {

	@Autowired
	private TagService tg;
	
	private HashMap<Integer, ArrayList<Tag>> tagMappings = new HashMap<Integer, ArrayList<Tag>>();
//	public ItemController() {
//		
//		
//	}
	
	
	@PostMapping("tags")
	public ResponseEntity<List<Tag>> createAcc(@RequestBody List<Tag> t) {
		ArrayList<Tag> one = new ArrayList<Tag>();
		one.add(tg.findById(4));
		one.add(tg.findById(5));
		one.add(tg.findById(6));
		
		ArrayList<Tag> four = new ArrayList<Tag>();
		four.add(tg.findById(7));
		four.add(tg.findById(8));
		
		ArrayList<Tag> eight = new ArrayList<Tag>();
		eight.add(tg.findById(9));
		eight.add(tg.findById(10));
		eight.add(tg.findById(11));
		eight.add(tg.findById(12));
		eight.add(tg.findById(13));
		eight.add(tg.findById(14));
		
		for(int i =0;i<tg.findAll().size();i++) {
			tagMappings.put(i,new ArrayList<Tag>());
		}
		tagMappings.put(1, one);
		tagMappings.put(4, four);
		tagMappings.put(8, eight);
		
//		System.out.println(tg.findAll());
//		for (Map.Entry<Integer,ArrayList<Tag>> entry : tagMappings.entrySet())  
//            System.out.println("Key = " + entry.getKey() + 
//                             ", Value = " + entry.getValue()); 
		
		Tag recentTag = t.get(t.size()-1);
		ArrayList<Tag> temp = tagMappings.get(recentTag.getTagId());
		
		return new ResponseEntity<List<Tag>>(temp,HttpStatus.ACCEPTED);
	}
	
}
