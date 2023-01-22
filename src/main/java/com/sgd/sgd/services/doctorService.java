package com.sgd.sgd.services;

import java.util.List;

import com.sgd.sgd.entities.doctor;

public interface doctorService {

	public List<doctor> findAll();

	public doctor findById(Long Id);

	public void save(doctor d);

	public void deleteById(Long Id);

	public void update(doctor d);

	public int CantDoc();
}
