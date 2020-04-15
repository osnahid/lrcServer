package com.lrc.lrcServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.DORepository;
import com.lrc.lrcServer.dao.DecomptesRepository;
import com.lrc.lrcServer.entities.DO;

@Service
public class DOServiceImp implements DOService{

	@Autowired
	private DORepository dr;
	@Autowired
	private DecomptesRepository der;
	
	public DO addDO(int id, DO d) {
		d.setDO(der.getOne(id));
		return dr.save(d);
	}

	public DO editDO(int id, DO d) {
		d.setDO(der.getOne(id));
		return dr.save(d);
	}

	public void deleteDO(int id) {
		dr.deleteById(id);
	}

}
