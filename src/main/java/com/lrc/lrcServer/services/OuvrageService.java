package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.Ouvrage;

public interface OuvrageService {
	public Ouvrage saveOuvrage(int id,Ouvrage o);
	public void delete(int id);
	public List<Ouvrage> getAllOuvrage();
}
