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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.Chantier;
import com.lrc.lrcServer.services.ChantierService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Chantiers")
public class ChantierController {
	
	@Autowired
	private ChantierService chs;

	@PostMapping("/Add")
	public Chantier addChantier(@RequestBody Chantier ch) {
		return chs.addChantier(ch);
	}

	@PutMapping("/Edit")
	public Chantier editChantier(@RequestBody Chantier ch) {
		return chs.editChantier(ch);
	}

	@GetMapping("/All")
	public List<Chantier> getChantiers() {
		return chs.getChantiers();
	}

	@GetMapping("/{id}")
	public Chantier getChantier(@PathVariable("id") String id) {
		return chs.getChantier(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteChantier(@PathVariable("id") String id) {
		chs.deleteChantier(id);
	}
	
	
}
