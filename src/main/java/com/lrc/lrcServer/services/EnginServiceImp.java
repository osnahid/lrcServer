package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.EnginCamionRepository;
import com.lrc.lrcServer.dao.EnginExtRepository;
import com.lrc.lrcServer.dao.EnginIntRepository;
import com.lrc.lrcServer.dao.EnginRepository;
import com.lrc.lrcServer.dao.EnginVehiculeRepository;
import com.lrc.lrcServer.entities.Engin;
import com.lrc.lrcServer.entities.EnginCamion;
import com.lrc.lrcServer.entities.EnginExt;
import com.lrc.lrcServer.entities.EnginInt;
import com.lrc.lrcServer.entities.EnginVehicule;

@Service
public class EnginServiceImp implements EnginService{
	
	@Autowired
	private EnginRepository er;
	
	@Autowired
	private EnginIntRepository eri;
	@Autowired
	private EnginCamionRepository erc;
	@Autowired
	private EnginExtRepository ere;
	@Autowired
	private EnginVehiculeRepository erv;

	public List<Engin> getAllEngin() {
		
		return er.findAll();
	}

	public List<EnginExt> getEnginExt() {
		
		return ere.findAll();
	}

	public List<EnginInt> getEnginInt() {
		
		return eri.findAll();
	}

	public List<EnginVehicule> getEnginVehicule() {
		
		return erv.findAll();
	}

	public List<EnginCamion> getEnginCamion() {
		
		return erc.findAll();
	}

	public EnginExt addEnginExt(EnginExt en) {
		
		return ere.save(en);
	}

	public EnginInt addEnginInt(EnginInt en) {
		
		return eri.save(en);
	}

	public EnginVehicule addEnginVehicule(EnginVehicule en) {
		
		return erv.save(en);
	}

	public EnginCamion addEnginCamion(EnginCamion en) {
		
		return erc.save(en);
	}

	public void deleteEngin(int id) {
		
		er.deleteById(id);
	}

	public Engin editEngin(Engin en) {
		
		return er.save(en);
	}

	public EnginExt editEnginExt(EnginExt en) {
		return ere.save(en);
	}

	public EnginInt editEnginInt(EnginInt en) {
		return eri.save(en);
	}

	public EnginVehicule editEnginVehicule(EnginVehicule en) {
		return erv.save(en);
	}

	public EnginCamion editEnginCamion(EnginCamion en) {
		return erc.save(en);
	}

	public EnginInt getEngin(int id) {
		return eri.findById(id).get();
	}
	
	
	
	
}