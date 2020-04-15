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

import com.lrc.lrcServer.entities.EtudePrix;
import com.lrc.lrcServer.services.EtudePrixService;





@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/EtudePrix")
public class EtudePrixController {
	
	@Autowired
	private EtudePrixService ets;


	@PostMapping("/{id}/Add")
	public EtudePrix addEtudePrix(@PathVariable("id") String id,@RequestBody EtudePrix et) {
		return ets.addEtudePrix(id, et);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteEtudePrix(@PathVariable("id") int et) {
		try {
			ets.deleteEtudePrix(et);
			return true;
		}catch(RuntimeException e) {
			return false;
		}
	}
	@PutMapping("/edit")
	public EtudePrix editEtudePrix(EtudePrix et) {
		return ets.editEtudePrix(et);
	}
	
	
	
}
