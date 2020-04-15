package com.lrc.lrcServer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrc.lrcServer.entities.CategorieMateriel;

public interface CatMatRepository extends JpaRepository<CategorieMateriel, Integer>{

}
