package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.LocationEP;

public interface LocationEpService{
	public List<LocationEP> addLocation(int id,List<LocationEP> l);
	public LocationEP editLocation(LocationEP l);
	public void Deletelocation(int id);
}
