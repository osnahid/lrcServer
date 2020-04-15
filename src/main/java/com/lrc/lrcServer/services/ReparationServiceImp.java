package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.ReparationRepository;
import com.lrc.lrcServer.entities.Reparation;

@Service
public class ReparationServiceImp implements ReparationService {
	
	@Autowired
	private ReparationRepository rr;

	public List<Reparation> addReparation(List<Reparation> r) {
		
		return rr.saveAll(r);
	}

	public Reparation editReparation(Reparation r) {
		return rr.save(r);
	}

	public void deleteReparation(int id) {
		rr.deleteById(id);
	}

}
