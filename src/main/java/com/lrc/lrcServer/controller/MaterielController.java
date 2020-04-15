package com.lrc.lrcServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.CategorieMateriel;
import com.lrc.lrcServer.entities.Materiel;
import com.lrc.lrcServer.services.MaterielService;

@RestController
public class MaterielController {
	
	
	@Autowired
	private MaterielService ms;

	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Materiels/All")
	public List<Materiel> getMateriel() {
		return ms.getMateriel();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Materiels/Add")
	public Materiel addMateriel(@RequestBody Materiel m) {
		return ms.addMateriel(m);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/Materiels/edit")
	public Materiel editMateriel(@RequestBody Materiel m) {
		return ms.editMateriel(m);
	}

	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/Materiels/delete/{id}")
	public void deleteMateriel(@PathVariable("id") int id) {
		ms.deleteMateriel(id);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Materiels/Categories")
	public List<CategorieMateriel> getCatMat() {
		return ms.getCatMat();
	}
	
	@PostMapping("/Materiels/Categories/add")
	public CategorieMateriel addCategorie(@RequestBody CategorieMateriel cm) {
		return ms.addCatMat(cm);
	}
	
	
	
}
