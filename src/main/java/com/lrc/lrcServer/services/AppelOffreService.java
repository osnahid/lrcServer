package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.AppelOffre;

public interface AppelOffreService {
	public boolean saveAppelOffre(AppelOffre ao);
	public AppelOffre modAppelOffre(AppelOffre ao);
	public List<AppelOffre> getAllAppleOffre();
	public AppelOffre getAppleOffre(String id);
	public void deleteAppelOffre(String id);
}
