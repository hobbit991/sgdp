package com.sgd.sgd.services;

import java.util.List;

import com.sgd.sgd.entities.doctorando;

public interface doctorandoService {
	public List<doctorando> findAll();

	public doctorando findById(Long Id);

	public void save(doctorando p);

	public void deleteById(Long Id);

	public void update(doctorando p);

	public int CantDoct();

}
