package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.CategorieRepository;
import com.lrc.lrcServer.entities.Categories;
import com.lrc.lrcServer.entities.Ouvrage;
@Service
public class CategorieServiceImp implements CategorieService{
	@Autowired
	private CategorieRepository categorieRepository;
	public Categories saveCategories(Categories c) {
		return categorieRepository.save(c);
	}

	public List<Categories> getAllCategories() {
		return categorieRepository.findAll();
	}

	public Categories editCategorie(int id,Ouvrage o) {
		Categories c = categorieRepository.getOne(id);
		c.getOuvrages().add(o);
		return categorieRepository.save(c);
	}

}
