package com.lrc.lrcServer.services;

import com.lrc.lrcServer.entities.DO;

public interface DOService {

	public DO addDO(int id,DO d);
	public DO editDO(int id,DO d);
	public void deleteDO(int id);
	
}
