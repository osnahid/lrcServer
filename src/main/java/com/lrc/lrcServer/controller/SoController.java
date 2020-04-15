package com.lrc.lrcServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.SO;
import com.lrc.lrcServer.services.SoService;

@RestController
public class SoController {

	@Autowired
	private SoService soService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/SO/{id}/AddL",method=RequestMethod.POST)
	public List<SO> addSos(@PathVariable("id") String id,@RequestBody List<SO> so) {
		return soService.addSos(id, so);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/SO/{id}/Add",method=RequestMethod.POST)
	public SO addSo(@PathVariable("id") String id,@RequestBody SO so) {
		return soService.addSo(id, so);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/SO/{id}/Delete",method=RequestMethod.DELETE)
	public void deleteSo(@PathVariable("id") int id) {
		soService.deleteSo(id);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/SO/{id}/Update",method=RequestMethod.PUT)
	public SO editSo(@PathVariable("id") String id,@RequestBody SO so) {
		return soService.editSo(id,so);
	}
	
	
	
	
}
