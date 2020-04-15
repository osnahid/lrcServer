package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.Engin;
import com.lrc.lrcServer.entities.EnginCamion;
import com.lrc.lrcServer.entities.EnginExt;
import com.lrc.lrcServer.entities.EnginInt;
import com.lrc.lrcServer.entities.EnginVehicule;

public interface EnginService {
	public List<Engin> getAllEngin();
	public List<EnginExt> getEnginExt();
	public List<EnginInt> getEnginInt();
	public List<EnginVehicule> getEnginVehicule();
	public List<EnginCamion> getEnginCamion();
	public EnginInt getEngin(int id);
	public EnginExt addEnginExt(EnginExt en);
	public EnginInt addEnginInt(EnginInt en);
	public EnginVehicule addEnginVehicule(EnginVehicule en);
	public EnginCamion addEnginCamion(EnginCamion en);
	public EnginExt editEnginExt(EnginExt en);
	public EnginInt editEnginInt(EnginInt en);
	public EnginVehicule editEnginVehicule(EnginVehicule en);
	public EnginCamion editEnginCamion(EnginCamion en);
	public void deleteEngin(int id);
	public Engin editEngin(Engin en);
}
