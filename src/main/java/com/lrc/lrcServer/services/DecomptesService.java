package com.lrc.lrcServer.services;

import com.lrc.lrcServer.entities.Decomptes;

public interface DecomptesService {
	
	public Decomptes addDecompte(String id,Decomptes d);
	public void deleteDecomptes(int id);
}
