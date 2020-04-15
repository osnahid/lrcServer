package com.lrc.lrcServer.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrc.lrcServer.dao.AppelOffreRepository;
import com.lrc.lrcServer.dao.InstallationChantierRepository;
import com.lrc.lrcServer.dao.SoumissionRepository;
import com.lrc.lrcServer.entities.AppelOffre;
import com.lrc.lrcServer.entities.Soumission;

@Service
public class AppelOffreServiceImp implements AppelOffreService {
	@Autowired
	public AppelOffreRepository appelOffreRepository;
	
	@Autowired
	public SoumissionRepository soumissionRepository;
	
	@Autowired
	public InstallationChantierRepository icr;
	
	@Transactional
	public boolean saveAppelOffre(AppelOffre ao) {
		if(!appelOffreRepository.existsById(ao.getNumAO())) {
			Soumission s = new Soumission();
			AppelOffre a = appelOffreRepository.save(ao);
			s.setAo(a);
			s.setDate(new Date());
			soumissionRepository.save(s);
		return true;
		}else
		return false;
	}

	public List<AppelOffre> getAllAppleOffre() {
		return appelOffreRepository.findAll();
	}

	public void deleteAppelOffre(String id) {
		appelOffreRepository.deleteById(id);
	}

	public AppelOffre modAppelOffre(AppelOffre ao) {
		return appelOffreRepository.save(ao);
	}

	public AppelOffre getAppleOffre(String id) {
		return appelOffreRepository.findById(id).get();
	}
	
}
