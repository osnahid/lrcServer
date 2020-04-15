package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.ChantierRepository;
import com.lrc.lrcServer.dao.LCHRepository;
import com.lrc.lrcServer.entities.LocationCh;

@Service
public class LocationChServiceImp implements LocationChService{

	@Autowired
	private LCHRepository lchr;
	
	@Autowired
	private ChantierRepository ch;
	
	public List<LocationCh> addLocation(String id, List<LocationCh> l) {
		for(LocationCh la: l)
		la.setCHL(ch.getOne(id));
		return lchr.saveAll(l);
	}

	public LocationCh editLocation(LocationCh l) {
		return lchr.save(l);
	}

	public void Deletelocation(int id) {
		lchr.deleteById(id);
	}

}
