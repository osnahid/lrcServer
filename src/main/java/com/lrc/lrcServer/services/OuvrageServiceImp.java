package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.CategorieRepository;
import com.lrc.lrcServer.dao.OuvrageRepository;
import com.lrc.lrcServer.entities.Ouvrage;
@Service
public class OuvrageServiceImp implements OuvrageService{
	@Autowired
	public OuvrageRepository ouvrageRepository;
	@Autowired
	public CategorieRepository cr;
	@Override
	public Ouvrage saveOuvrage(int id,Ouvrage o) {
		// TODO Auto-generated method stub
		o.setCategorie(cr.getOne(id));
		return ouvrageRepository.save(o);
	}

	@Override
	public List<Ouvrage> getAllOuvrage() {
		// TODO Auto-generated method stub
		return ouvrageRepository.findAll();
	}

	public void delete(int id) {
		ouvrageRepository.deleteById(id);
		
	}

}
