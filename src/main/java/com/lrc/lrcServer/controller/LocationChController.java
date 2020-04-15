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

import com.lrc.lrcServer.entities.LocationCh;
import com.lrc.lrcServer.services.LocationChService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/LocationsChantier")
public class LocationChController {
	
	@Autowired
	private LocationChService lcs;

	@PostMapping("/add/{id}")
	public List<LocationCh> addLocation(@PathVariable("id") String id,@RequestBody List<LocationCh> l) {
		return lcs.addLocation(id, l);
	}

	@PutMapping("/edit")
	public LocationCh editLocation(@RequestBody LocationCh l) {
		return lcs.editLocation(l);
	}

	@DeleteMapping("/delete/{id}")
	public boolean Deletelocation(@PathVariable("id") int id) {
		try {
			lcs.Deletelocation(id);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	
}
