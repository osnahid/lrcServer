package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.PersonnelRepository;
import com.lrc.lrcServer.entities.Personnel;

@Service
public class PersonnelServiceImp implements PersonnelService {

	@Autowired
	private PersonnelRepository pr;
	
	
	public Personnel addPersonnel(Personnel p) {
		return pr.save(p);
	}

	public List<Personnel> getPersonnel() {
		return pr.findAll();
	}

	public Personnel editPersonnel(Personnel p) {
		return pr.save(p);
	}

	public void deletePersonnel(int id) {
		pr.deleteById(id);
	}

}
