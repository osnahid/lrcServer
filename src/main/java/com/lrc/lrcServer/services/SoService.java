package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.SO;


public interface SoService {
	public List<SO> addSos(String id,List<SO> so);
	public SO addSo(String id,SO so);
	public void deleteSo(int id);
	public SO editSo(String id,SO so);
}
