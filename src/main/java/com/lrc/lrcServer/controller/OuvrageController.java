package com.lrc.lrcServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.Ouvrage;
import com.lrc.lrcServer.services.OuvrageService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Ouvrages")
public class OuvrageController {
@Autowired
private OuvrageService ouvrageService;

@PostMapping("/{id}/add")
public Ouvrage saveOuvrage(@PathVariable("id") final int c,@RequestBody Ouvrage o) {
	return ouvrageService.saveOuvrage(c,o);
}

@GetMapping("/All")
public List<Ouvrage> getAllOuvrage() {
	return ouvrageService.getAllOuvrage();
}

@DeleteMapping("/delete/{id}")
public void deleteOuvrage(@PathVariable("id") int id) {
	ouvrageService.delete(id);
}

}
