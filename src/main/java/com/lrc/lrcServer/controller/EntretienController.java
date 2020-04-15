package com.lrc.lrcServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.Entretien;
import com.lrc.lrcServer.services.ChantierService;
import com.lrc.lrcServer.services.EntretienService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Entretiens")
public class EntretienController {
	
	@Autowired
	private EntretienService es;
	
	@Autowired
	private ChantierService cs;

	@PostMapping("/add/{id}")
	public List<Entretien> addEntretien(@PathVariable("id") String id,@RequestBody List<Entretien> e) {
		for(Entretien en: e) {
			en.setCHE(cs.getChantier(id));
		}
		return es.addEntretien(e);
	}

	@PutMapping("/edit/{id}")
	public Entretien editEntretien(@PathVariable("id") String id,@RequestBody Entretien e) {
		e.setCHE(cs.getChantier(id));
		return es.editEntretien(e);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEntretien(@PathVariable("id") int id) {
		es.deleteEntretien(id);
	}
	
	
	

}
