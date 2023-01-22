package com.sgd.sgd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgd.sgd.entities.persona;
import com.sgd.sgd.repository.personaRepository;

@Service

public class personaServiceImp implements personaService {
	public personaRepository perRep;

	@Autowired
	public personaServiceImp(personaRepository PerRep) {

		PerRep = perRep;
	}

	@Override
	public List<persona> findAll() {

		return perRep.findAll();
	}

	@Override
	public persona findById(Long Id) {

		return perRep.findById(Id).get();
	}

	@Override
	public void save(persona p) {
		perRep.save(p);

	}

	@Override
	public void deleteById(Long Id) {
		perRep.deleteById(Id);

	}

	@Override
	public void update(persona p) {
		perRep.save(p);

	}

}
