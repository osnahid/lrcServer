package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.EtudePrixRepository;
import com.lrc.lrcServer.dao.LocationEPRepository;
import com.lrc.lrcServer.entities.LocationEP;

@Service
public class LocationEPServiceImp implements LocationEpService {

	@Autowired
	private LocationEPRepository lr;
	
	@Autowired
	private EtudePrixRepository etr;
	
	public List<LocationEP> addLocation(int id, List<LocationEP> ls) {
		for(LocationEP l: ls)l.setEPL(etr.getOne(id));
		return lr.saveAll(ls);
	}

	
	public void Deletelocation(int id) {
		lr.deleteById(id);
	}


	public LocationEP editLocation(LocationEP l) {
		return lr.save(l);
	}

}
