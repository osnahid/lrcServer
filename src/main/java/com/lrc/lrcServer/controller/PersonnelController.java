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

import com.lrc.lrcServer.entities.Personnel;
import com.lrc.lrcServer.services.PersonnelService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Personnels")
public class PersonnelController {
	
	@Autowired
	private PersonnelService ps;
	
	
	@PostMapping("/Add")
	public Personnel addPersonnel(@RequestBody Personnel p) {
		return ps.addPersonnel(p);
	}

	@GetMapping("/All")
	public List<Personnel> getPersonnel() {
		return ps.getPersonnel();
	}

	@PutMapping("/edit")
	public Personnel editPersonnel(@RequestBody Personnel p) {
		return ps.editPersonnel(p);
	}

	@DeleteMapping("/delete/{id}")
	public boolean deletePersonnel(@PathVariable("id") int id) {
		try {
			ps.deletePersonnel(id);
			return true;
		}catch(Exception e) {
			return false;
		}
		
		
	}
	
	
}
