package com.hackathon.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.application.model.ItemTag;

public interface ItemTagRepository extends JpaRepository<ItemTag,Integer> {

}
