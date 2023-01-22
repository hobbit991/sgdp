package com.sgd.sgd.services;

import java.util.List;

import com.sgd.sgd.entities.persona;

public interface personaService {
	public List<persona> findAll();

	public persona findById(Long Id);

	public void save(persona p);

	public void deleteById(Long Id);

	public void update(persona p);

}
