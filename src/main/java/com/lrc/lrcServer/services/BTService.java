package com.lrc.lrcServer.services;

import com.lrc.lrcServer.entities.BesoinTransverses;

public interface BTService {
	
	public BesoinTransverses addBT(String id,BesoinTransverses bt);
	public BesoinTransverses editBT(String id,BesoinTransverses bt);
	public void deleteBt(int id);

}
