package com.sgd.sgd.services;

import java.util.List;

import com.sgd.sgd.entities.programa;

public interface programaService {
	public List<programa> findAll();

	public programa findById(Long Id);

	public void save(programa p);

	public void deleteById(Long Id);

	public void update(programa p);

}
