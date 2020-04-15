package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.Entretien;

public interface EntretienService{

	public List<Entretien> addEntretien(List<Entretien> e);
	public Entretien editEntretien(Entretien e);
	public void deleteEntretien(int id);
	
}
