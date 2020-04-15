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

import com.lrc.lrcServer.entities.Engin;
import com.lrc.lrcServer.entities.EnginCamion;
import com.lrc.lrcServer.entities.EnginExt;
import com.lrc.lrcServer.entities.EnginInt;
import com.lrc.lrcServer.entities.EnginVehicule;
import com.lrc.lrcServer.services.EnginServiceImp;






@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/engins")
public class EnginController {
	@Autowired
	private EnginServiceImp es;

	
	@GetMapping("/All")
	public List<Engin> getAllEngin() {
		return es.getAllEngin();
	}
	
	@GetMapping("/{id}")
	public Engin getEngin(@PathVariable("id") int id) {
		return es.getEngin(id);
	}
	
	@GetMapping("/externe")
	public List<EnginExt> getEnginExt() {
		return es.getEnginExt();
	}
	
	
	@GetMapping("/interne")
	public List<EnginInt> getEnginInt() {
		return es.getEnginInt();
	}
	
	
	@GetMapping("/vehicule")
	public List<EnginVehicule> getEnginVehicule() {
		return es.getEnginVehicule();
	}

	@GetMapping("/camion")
	public List<EnginCamion> getEnginCamion() {
		return es.getEnginCamion();
	}
	
	@PostMapping("/Add/externe")
	public EnginExt addEnginExt(@RequestBody EnginExt en) {
		return es.addEnginExt(en);
	}
	
	@PostMapping("/Add/interne")
	public EnginInt addEnginInt(@RequestBody EnginInt en) {
		return es.addEnginInt(en);
	}

	@PostMapping("/Add/vehicule")
	public EnginVehicule addEnginVehicule(@RequestBody EnginVehicule en) {
		return es.addEnginVehicule(en);
	}

	@PostMapping("/Add/camion")
	public EnginCamion addEnginCamion(@RequestBody EnginCamion en) {
		return es.addEnginCamion(en);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEngin(@PathVariable("id") int id) {
		es.deleteEngin(id);
	}
	
	@PutMapping("/edit/externe")
	public EnginExt editEnginExt(@RequestBody EnginExt en) {
		return es.editEnginExt(en);
	}
	
	@PutMapping("/edit/interne")
	public EnginInt editEnginInt( @RequestBody EnginInt en) {
		return es.editEnginInt(en);
	}
	
	@PutMapping("/edit/vehicule")
	public EnginVehicule editEnginVehicule( @RequestBody EnginVehicule en) {
		return es.editEnginVehicule(en);
	}
	
	@PutMapping("/edit/camion")
	public EnginCamion editEnginCamion( @RequestBody EnginCamion en) {
		return es.editEnginCamion(en);
	}
	
	
	
}
