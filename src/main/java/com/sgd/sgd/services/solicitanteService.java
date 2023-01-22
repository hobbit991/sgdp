package com.sgd.sgd.services;

import java.util.List;

import com.sgd.sgd.entities.solicitante;

public interface solicitanteService {

	public List<solicitante> findAll();

	public solicitante findById(Long Id);

	public void save(solicitante s);

	public void deleteById(Long Id);

	public void update(solicitante s);

	public int CantSol();

}
