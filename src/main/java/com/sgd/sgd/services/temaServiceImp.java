package com.sgd.sgd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgd.sgd.entities.tema_investigacion;
import com.sgd.sgd.repository.temaRepository;

@Service
public class temaServiceImp implements temaService {
	@Autowired
	temaRepository temaRep;

	public temaServiceImp(temaRepository TemaRep) {

		temaRep = TemaRep;
	}

	@Override
	public tema_investigacion findById(Long Id) {

		return temaRep.findById(Id).get();
	}

	@Override
	public void save(tema_investigacion t) {
		temaRep.save(t);

	}

	@Override
	public void deleteById(Long Id) {
		temaRep.deleteById(Id);

	}

	@Override
	public void update(tema_investigacion t) {
		temaRep.save(t);

	}

	@Override
	public List<tema_investigacion> findAll() {

		return temaRep.findAll();
	}

}
