package com.hackathon.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.application.model.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {

}
