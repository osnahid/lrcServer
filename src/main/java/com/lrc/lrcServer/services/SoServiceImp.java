package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrc.lrcServer.dao.AppelOffreRepository;
import com.lrc.lrcServer.dao.SoRepository;
import com.lrc.lrcServer.entities.AppelOffre;
import com.lrc.lrcServer.entities.SO;

@Service
public class SoServiceImp implements SoService{
	@Autowired
	private SoRepository soRepository;
	
	@Autowired
	public AppelOffreRepository appelOffreRepository;
	
	@Transactional
	public List<SO> addSos(String id,List<SO> so) {
		AppelOffre ao = appelOffreRepository.getOne(id);
		for(SO s: so) s.setSoum(ao.getSoumission());
		return soRepository.saveAll(so);
	}
	
	public void deleteSo(int id) {
		soRepository.deleteById(id);
	}
	
	@Transactional
	public SO editSo(String id,SO so) {
		AppelOffre ao = appelOffreRepository.getOne(id);
		so.setSoum(ao.getSoumission());
		return soRepository.save(so);
	}
	@Transactional
	public SO addSo(String id, SO so) {
		AppelOffre ao = appelOffreRepository.getOne(id);
		so.setSoum(ao.getSoumission());
		return soRepository.save(so);
	}

}
