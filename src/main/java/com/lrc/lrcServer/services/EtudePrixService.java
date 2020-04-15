package com.lrc.lrcServer.services;

import com.lrc.lrcServer.entities.EtudePrix;

public interface EtudePrixService {
	public EtudePrix addEtudePrix(String id,EtudePrix et);
	public EtudePrix editEtudePrix(EtudePrix et);
	public void deleteEtudePrix(int et);
}
