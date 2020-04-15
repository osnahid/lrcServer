package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.LocationCh;

public interface LocationChService {
	public List<LocationCh> addLocation(String id,List<LocationCh> l);
	public LocationCh editLocation(LocationCh l);
	public void Deletelocation(int id);
}
