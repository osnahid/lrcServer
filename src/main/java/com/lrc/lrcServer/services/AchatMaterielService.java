package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.AchatMaterielCh;
import com.lrc.lrcServer.entities.AchatMaterielEt;

public interface AchatMaterielService {
	public List<AchatMaterielEt> addMaterielEt(int id,List<AchatMaterielEt> mat);
	public List<AchatMaterielCh> addMaterielCh(String id,List<AchatMaterielCh> mat);
	public AchatMaterielCh addMaterielCh(String id,AchatMaterielCh mat);
	
	public void deleteAchatMateriel(int id);
	
	public AchatMaterielEt editMaterielEt(int id,AchatMaterielEt mat);
	public AchatMaterielCh editMaterielCh(String id,AchatMaterielCh mat);
}
