package com.lrc.lrcServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.AppelOffreRepository;
import com.lrc.lrcServer.dao.EtudePrixRepository;
import com.lrc.lrcServer.entities.EtudePrix;


@Service
public class EtudePrixServiceImp implements EtudePrixService {

	@Autowired
	private EtudePrixRepository etudePrixRepository;
	
	@Autowired
	private AppelOffreRepository appelOffreRepository;
	
	public EtudePrix addEtudePrix(String id, EtudePrix et) {
		et.setAoEP(appelOffreRepository.getOne(id));
		return etudePrixRepository.save(et);
	}

	public void deleteEtudePrix(int et) {
		etudePrixRepository.deleteById(et);
	}

	public EtudePrix editEtudePrix(EtudePrix et) {
		return etudePrixRepository.save(et);
	}

}
