package com.lrc.lrcServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.AchatMaterielCh;
import com.lrc.lrcServer.entities.AchatMaterielEt;
import com.lrc.lrcServer.services.AchatMaterielService;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AchatMaterielController {
	@Autowired
	private AchatMaterielService ams;

	
	
	@PostMapping("/AchatMateriaux/{id}/et/add")
	public List<AchatMaterielEt> addMaterielEt(@PathVariable("id") int id,@RequestBody List<AchatMaterielEt> mat) {
		return ams.addMaterielEt(id, mat);
	}

	@PostMapping("/AchatMateriaux/{id}/ch/add")
	public AchatMaterielCh addMaterielCh(@PathVariable("id") String id,@RequestBody AchatMaterielCh mat) {
		return ams.addMaterielCh(id, mat);
	}

	
	@DeleteMapping("/AchatMateriaux/delete/{id}")
	public void deleteAchatMateriel(@PathVariable("id") int id) {
		ams.deleteAchatMateriel(id);
	}

	@PutMapping("/AchatMateriaux/et/edit/{id}")
	public AchatMaterielEt editMaterielEt(@PathVariable("id") int id,@RequestBody AchatMaterielEt mat) {
		return ams.editMaterielEt(id,mat);
	}
	
	@PutMapping("/AchatMateriaux/ch/edit/{id}")
	public AchatMaterielCh editMaterielCh(@PathVariable("id") String id,@RequestBody AchatMaterielCh mat) {
		return ams.editMaterielCh(id,mat);
	}
	
	@PostMapping("/AchatMateriaux/{id}/ch/adds")
	public List<AchatMaterielCh> addMaterielCh(@PathVariable("id") String id,@RequestBody List<AchatMaterielCh> mat) {
		return ams.addMaterielCh(id, mat);
	}
	
	
	

	

}
