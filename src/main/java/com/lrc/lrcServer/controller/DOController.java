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

import com.lrc.lrcServer.entities.DO;
import com.lrc.lrcServer.services.DOService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Dos")
public class DOController {
	
	@Autowired
	private DOService dos;

	@PostMapping("/add/{id}")
	public DO addDO(@PathVariable("id") int id, @RequestBody  DO d) {
		return dos.addDO(id, d);
	}

	@PutMapping("/edit/{id}")
	public DO editDO(@PathVariable("id") int id, @RequestBody  DO d) {
		return dos.editDO(id,d);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteDO(@PathVariable("id") int id) {
		dos.deleteDO(id);
	}
	
	
}
