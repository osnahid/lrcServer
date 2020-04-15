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

import com.lrc.lrcServer.entities.LocationEP;
import com.lrc.lrcServer.services.LocationEpService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Location")
public class LocationEpController {

	@Autowired
	private LocationEpService epService;

	
	@PostMapping("/{id}/Add")
	public List<LocationEP> addLocation(@PathVariable("id") int id,@RequestBody List<LocationEP> l) {
		return epService.addLocation(id, l);
	}

	@DeleteMapping("/{id}/Delete")
	public void Deletelocation(@PathVariable("id") int id) {
		epService.Deletelocation(id);
	}

	@PutMapping("/edit")
	public LocationEP editLocation(LocationEP l) {
		return epService.editLocation(l);
	}
	 
	
	
	
}
