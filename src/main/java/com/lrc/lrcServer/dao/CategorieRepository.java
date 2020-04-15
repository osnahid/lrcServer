package com.lrc.lrcServer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrc.lrcServer.entities.Categories;

public interface CategorieRepository extends JpaRepository<Categories, Integer>{

}
