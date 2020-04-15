package com.lrc.lrcServer.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lrc.lrcServer.entities.AppelOffre;
import com.lrc.lrcServer.entities.InstallationChantier;
import com.lrc.lrcServer.services.AppelOffreService;
import com.lrc.lrcServer.services.InstallationChantierService;
import com.lrc.lrcServer.util.ExcelGenerator;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/AppelOffres")
public class AOController {
@Autowired
private AppelOffreService appelOffreService;

@Autowired
private InstallationChantierService isc;

@PostMapping("/Add")
public Boolean addAO(@RequestBody AppelOffre ao) {
	ao.setDateAO(new Date());
	return appelOffreService.saveAppelOffre(ao);
}

@PutMapping("/Mod")
public AppelOffre modifyAO(@RequestBody AppelOffre ao) {
	return appelOffreService.modAppelOffre(ao);
}


@GetMapping("/All")
public List<AppelOffre> getAllAo(){
	return appelOffreService.getAllAppleOffre();
}

@GetMapping("/{id}")
public AppelOffre getAo(@PathVariable("id") String id){
	return appelOffreService.getAppleOffre(id);
}

@DeleteMapping("/{id}/delete")
public Boolean delete(@PathVariable("id") String id) {
	try {
		appelOffreService.deleteAppelOffre(id);
		return true;
	}catch(RuntimeException e) {
		return false;
	}
	
}

@GetMapping("/{id}/soumissionDownload")
public ResponseEntity<InputStreamResource> SoumissionReport(@PathVariable("id") String id) throws IOException {
	AppelOffre ao =appelOffreService.getAppleOffre(id);
	ByteArrayInputStream in = ExcelGenerator.exportSoumission(ao);
	
	HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Disposition", "attachment; filename=soumission-"+ ao.getNumAO() +".xlsx");
    
	 return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
}


@PostMapping("/{id}/ic/add")
public InstallationChantier addIC(@PathVariable("id") String id,@RequestBody InstallationChantier ic) {
		ic.setAoi(appelOffreService.getAppleOffre(id));
		return isc.saveIC(ic);
}


@PutMapping("/{id}/ic/edit")
public InstallationChantier editIC(@PathVariable("id") String id,@RequestBody InstallationChantier ic) {
		ic.setAoi(appelOffreService.getAppleOffre(id));
		return isc.saveIC(ic);
}

@DeleteMapping("/ic/delete/{id}")
public boolean deleteIc(@PathVariable("id") int ic) {
	try {
		isc.deleteIc(ic);
		return true;
	}catch(RuntimeException e) {
		return false;
	}
	
}





}
