package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.CatMatRepository;
import com.lrc.lrcServer.dao.MaterielRepository;
import com.lrc.lrcServer.entities.CategorieMateriel;
import com.lrc.lrcServer.entities.Materiel;

@Service
public class MaterielServiceImp implements MaterielService{
	
	@Autowired
	private MaterielRepository mr;
	
	@Autowired
	private CatMatRepository cmr;
	
	public Materiel addMateriel(Materiel m) {
		return mr.save(m);
	}

	
	public Materiel editMateriel(Materiel m) {
		return mr.save(m);
	}


	public void deleteMateriel(int id) {
		mr.deleteById(id);
	}


	public List<Materiel> getMateriel() {
		return mr.findAll();
	}


	public List<CategorieMateriel> getCatMat() {
		return cmr.findAll();
	}


	
	public CategorieMateriel addCatMat(CategorieMateriel cm) {
		return cmr.save(cm);
	}

	
	
}
