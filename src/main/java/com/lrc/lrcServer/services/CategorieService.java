package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.Categories;
import com.lrc.lrcServer.entities.Ouvrage;

public interface CategorieService {
	public Categories saveCategories(Categories c);
	public List<Categories> getAllCategories();
	public Categories editCategorie(int id, Ouvrage o);
}
