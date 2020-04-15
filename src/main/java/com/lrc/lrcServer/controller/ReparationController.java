package com.lrc.lrcServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.Reparation;
import com.lrc.lrcServer.services.ChantierService;
import java.util.List;
import com.lrc.lrcServer.services.ReparationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Reparations")
public class ReparationController {

	@Autowired
	private ReparationService rs;
	
	@Autowired
	private ChantierService cs;

	@PostMapping("/add/{id}")
	public List<Reparation> addReparation(@PathVariable("id") String id,@RequestBody List<Reparation> r) {
		for(Reparation re : r)
		re.setCHR(cs.getChantier(id));
		return rs.addReparation(r);
	}

	@PutMapping("/edit/{id}")
	public Reparation editReparation(@PathVariable("id") String id,@RequestBody Reparation r) {
		r.setCHR(cs.getChantier(id));
		return rs.editReparation(r);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteReparation(@PathVariable("id") int id) {
		rs.deleteReparation(id);
	}
	
	
}
