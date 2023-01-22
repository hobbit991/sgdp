package com.sgd.sgd.services;

import java.util.List;

import com.sgd.sgd.entities.tema_investigacion;

public interface temaService {
	public List<tema_investigacion> findAll();

	public tema_investigacion findById(Long Id);

	public void save(tema_investigacion t);

	public void deleteById(Long Id);

	public void update(tema_investigacion t);

}
