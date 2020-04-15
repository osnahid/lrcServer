package com.lrc.lrcServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrc.lrcServer.dao.InstallationChantierRepository;
import com.lrc.lrcServer.entities.InstallationChantier;

@Service
public class InstallationChantierServiceImp implements InstallationChantierService {
	
	@Autowired
	private InstallationChantierRepository icr;

	public InstallationChantier saveIC(InstallationChantier ic) {
		return icr.save(ic);
	}


	public InstallationChantier editIC(InstallationChantier ic) {
		
		return icr.save(ic);
	}


	public void deleteIc(int ic) {
		icr.deleteById(ic);
	}

}
