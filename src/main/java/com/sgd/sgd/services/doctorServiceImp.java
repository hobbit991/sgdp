package com.sgd.sgd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgd.sgd.entities.doctor;
import com.sgd.sgd.repository.doctorRepository;

@Service
public class doctorServiceImp implements doctorService {
	private doctorRepository docRep;

	@Autowired

	protected doctorServiceImp(doctorRepository DocRep) {

		docRep = DocRep;
	}

	@Override
	public List<doctor> findAll() {

		return docRep.findAll();
	}

	@Override
	public doctor findById(Long Id) {

		return docRep.findById(Id).get();
	}

	@Override
	public void save(doctor d) {
		docRep.save(d);

	}

	@Override
	public void deleteById(Long Id) {
		docRep.deleteById(Id);

	}

	@Override
	public void update(doctor d) {
		docRep.save(d);

	}

	public List<doctor> findBynombre(String nombre) {
		return docRep.findBynombre(nombre);
	}

	@Override
	public int CantDoc() {

		return docRep.findAll().size();
	}
}
