package com.lrc.lrcServer.services;


import com.lrc.lrcServer.entities.InstallationChantier;

public interface InstallationChantierService {
	
	public InstallationChantier saveIC(InstallationChantier ic);
	public InstallationChantier editIC(InstallationChantier ic);
	public void deleteIc(int ic);

}
