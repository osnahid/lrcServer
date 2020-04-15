package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.EntretienRepository;
import com.lrc.lrcServer.entities.Entretien;

@Service
public class EntretienServiceImp implements EntretienService {
	
	@Autowired
	private EntretienRepository er;

	public List<Entretien> addEntretien(List<Entretien> e) {
		return er.saveAll(e);
	}

	public Entretien editEntretien(Entretien e) {
		return er.save(e);
	}

	public void deleteEntretien(int id) {
		er.deleteById(id);
	}

}
