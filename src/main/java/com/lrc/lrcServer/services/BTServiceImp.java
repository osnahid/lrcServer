package com.lrc.lrcServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.BTRepository;
import com.lrc.lrcServer.dao.ChantierRepository;
import com.lrc.lrcServer.entities.BesoinTransverses;

@Service
public class BTServiceImp implements BTService {

	@Autowired
	private BTRepository btr;
	
	@Autowired
	private ChantierRepository cr;
	
	public BesoinTransverses addBT(String id,BesoinTransverses bt) {
		bt.setCHBT(cr.getOne(id));
		return btr.save(bt);
	}

	public BesoinTransverses editBT(String id,BesoinTransverses bt) {
		bt.setCHBT(cr.getOne(id));
		return btr.save(bt);
	}

	public void deleteBt(int id) {
		btr.deleteById(id);
	}

}
