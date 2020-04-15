package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lrc.lrcServer.dao.ChantierRepository;
import com.lrc.lrcServer.entities.Chantier;

@Service
public class ChantierServiceImpl implements ChantierService {

	@Autowired
	private ChantierRepository CHR;
	
	
	public Chantier addChantier(Chantier ch) {
		ch.setEtat("enCours");
		return CHR.save(ch);
	}

	public Chantier editChantier(Chantier ch) {
		return CHR.save(ch);
	}

	public List<Chantier> getChantiers() {
		return CHR.findAll();
	}

	public Chantier getChantier(String id) {
		return CHR.findById(id).get();
	}

	public void deleteChantier(String id) {
		CHR.deleteById(id);
	}

}
