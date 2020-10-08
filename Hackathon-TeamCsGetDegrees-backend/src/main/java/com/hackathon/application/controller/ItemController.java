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
	
	private HashMap<String, ArrayList<Tag>> tagMappings = new HashMap<String, ArrayList<Tag>>();
	
	@PostMapping("tags")
	public List<Tag> createAcc(@RequestBody List<Tag> t) {
		for(int i =0;i<tg.findAll().size();i++) {
			tagMappings.put(tg.findAll().get(i).getTagName(),new ArrayList<Tag>());
		}
		
		ArrayList<Tag> hasMaps = new ArrayList<Tag>();
		for(int i =0;i<tg.findAll().size();i++) {
			if(tg.findAll().get(i).getLevel()!= 0){// && tg.findAll().get(i).getIsFinal() !=1) {
				hasMaps.add(tg.findAll().get(i));
			}
		
		}
//		for (Map.Entry<String,ArrayList<Tag>> entry : tagMappings.entrySet())  
//            System.out.println("Key = " + entry.getKey() + 
//                             ", Value = " + entry.getValue()); 
//		
//		System.out.println(hasMaps);
//		System.out.println(tg.findAll());
		
		for(int j=0;j<hasMaps.size();j++) {
			if(hasMaps.get(j).getPrecedingNode()==null) {
				//System.out.println("null prec node");
			}
			else {
				//System.out.println(hasMaps.get(j).getPrecedingNode());
				tagMappings.get(hasMaps.get(j).getPrecedingNode()).add(hasMaps.get(j));
			}
		}
		
//		for (Map.Entry<String,ArrayList<Tag>> entry : tagMappings.entrySet())  
//            System.out.println("Key = " + entry.getKey() + 
//                             ", Value = " + entry.getValue()); 
		
		
		Tag recentTag = t.get(t.size()-1);
		ArrayList<Tag> temp = tagMappings.get(recentTag.getTagName());
		return temp;
	}
	
}
