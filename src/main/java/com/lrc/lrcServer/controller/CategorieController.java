package com.lrc.lrcServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.Categories;
import com.lrc.lrcServer.entities.Ouvrage;
import com.lrc.lrcServer.services.CategorieService;

@RestController
public class CategorieController {
@Autowired
private CategorieService categorieService;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/Categories/add",method=RequestMethod.POST)
public Categories saveCategories(@RequestBody Categories c) {
	return categorieService.saveCategories(c);
}
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/Categories/All",method=RequestMethod.GET)
public List<Categories> getAllCategories() {
	return categorieService.getAllCategories();
}
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/Categories/edit/{id}",method=RequestMethod.PUT)
public Categories updateCategories(@PathVariable("id") int c,@RequestBody Ouvrage o) {
	return categorieService.editCategorie(c, o);
}
}
