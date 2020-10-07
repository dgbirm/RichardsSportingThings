package com.hackathon.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.application.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}
