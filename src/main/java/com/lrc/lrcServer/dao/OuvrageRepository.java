package com.lrc.lrcServer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrc.lrcServer.entities.Ouvrage;

public interface OuvrageRepository extends JpaRepository<Ouvrage, Integer>{

}
