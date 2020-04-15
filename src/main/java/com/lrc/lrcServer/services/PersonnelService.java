package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.Personnel;

public interface PersonnelService {

	public Personnel addPersonnel(Personnel p);
	public List<Personnel> getPersonnel();
	public Personnel editPersonnel(Personnel p);
	public void deletePersonnel(int id);
}
