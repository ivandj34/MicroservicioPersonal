package com.mx.personas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.personas.entidad.Persona;

public interface PersonaDao  extends JpaRepository<Persona, String>{
	

}
