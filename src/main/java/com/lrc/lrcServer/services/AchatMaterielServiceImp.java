package com.lrc.lrcServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.AMCHRepository;
import com.lrc.lrcServer.dao.AMEPRepository;
import com.lrc.lrcServer.dao.AMRepository;
import com.lrc.lrcServer.dao.ChantierRepository;
import com.lrc.lrcServer.dao.EtudePrixRepository;
import com.lrc.lrcServer.entities.AchatMaterielCh;
import com.lrc.lrcServer.entities.AchatMaterielEt;

@Service
public class AchatMaterielServiceImp implements AchatMaterielService{
	
	@Autowired
	private AMCHRepository achr;
	
	@Autowired
	private AMEPRepository aepr;
	
	@Autowired
	private AMRepository am;
	
	@Autowired
	private EtudePrixRepository lr;
	
	@Autowired
	private ChantierRepository chr;


	public void deleteMateriel(int id) {
		am.deleteById(id);
		
	}


	public List<AchatMaterielEt> addMaterielEt(int id, List<AchatMaterielEt> mat) {
		for(AchatMaterielEt matr: mat)
		matr.setEPAM(lr.getOne(id));
		return aepr.saveAll(mat);
	}


	public AchatMaterielCh addMaterielCh(String id, AchatMaterielCh mat) {
		mat.setCHAC(chr.getOne(id));
		return achr.save(mat);
	}


	public void deleteAchatMateriel(int id) {
		am.deleteById(id);
	}


	public AchatMaterielEt editMaterielEt(int id,AchatMaterielEt mat) {
		mat.setEPAM(lr.getOne(id));
		return aepr.save(mat);
	}


	public AchatMaterielCh editMaterielCh(String id,AchatMaterielCh mat) {
		mat.setCHAC(chr.getOne(id));
		return achr.save(mat);
	}


	public List<AchatMaterielCh> addMaterielCh(String id, List<AchatMaterielCh> mat) {
		for(AchatMaterielCh matr: mat)
		matr.setCHAC(chr.getOne(id));
		return achr.saveAll(mat);
	}
	

}
