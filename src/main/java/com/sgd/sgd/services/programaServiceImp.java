package com.sgd.sgd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgd.sgd.entities.programa;
import com.sgd.sgd.repository.programaRepository;

@Service
public class programaServiceImp implements programaService {
	@Autowired
	programaRepository proRep;

	public programaServiceImp(programaRepository ProRep) {

		proRep = ProRep;
	}

	@Override
	public List<programa> findAll() {

		return proRep.findAll();
	}

	@Override
	public programa findById(Long Id) {

		return proRep.findById(Id).get();
	}

	@Override
	public void save(programa p) {
		proRep.save(p);

	}

	@Override
	public void deleteById(Long Id) {
		proRep.deleteById(Id);

	}

	@Override
	public void update(programa p) {
		proRep.save(p);

	}

}
