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

import com.lrc.lrcServer.entities.BesoinTransverses;
import com.lrc.lrcServer.services.BTService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/BT")
public class BTController {
	
	@Autowired
	private BTService bts;

	@PostMapping("/Add/{id}")
	public BesoinTransverses addBT(@PathVariable("id") String id,@RequestBody BesoinTransverses bt) {
		return bts.addBT(id,bt);
	}

	@PutMapping("/Edit/{id}")
	public BesoinTransverses editBT(@PathVariable("id") String id,@RequestBody BesoinTransverses bt) {
		return bts.editBT(id,bt);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBt(@PathVariable("id") int id) {
		bts.deleteBt(id);
	}
	
	
}
