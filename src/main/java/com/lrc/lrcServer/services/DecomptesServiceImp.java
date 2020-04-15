package com.lrc.lrcServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.ChantierRepository;
import com.lrc.lrcServer.dao.DecomptesRepository;
import com.lrc.lrcServer.entities.Decomptes;

@Service
public class DecomptesServiceImp implements DecomptesService {
	
	@Autowired
	private DecomptesRepository dr;
	
	@Autowired
	private ChantierRepository ch;

	public Decomptes addDecompte(String id,Decomptes d) {
		d.setCHD(ch.getOne(id));
		return dr.save(d);
	}

	public void deleteDecomptes(int id) {
		dr.deleteById(id);
	}

}
