package com.sgd.sgd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgd.sgd.entities.doctorando;
import com.sgd.sgd.repository.doctorandoRepository;

@Service
public class doctorandoServiceImp implements doctorandoService {
	@Autowired
	private doctorandoRepository doctRep;

	protected doctorandoServiceImp(doctorandoRepository DoctRep) {

		doctRep = DoctRep;
	}

	@Override
	public List<doctorando> findAll() {

		return doctRep.findAll();
	}

	@Override
	public doctorando findById(Long Id) {

		return doctRep.findById(Id).get();
	}

	@Override
	public void save(doctorando p) {
		doctRep.save(p);
	}

	@Override
	public void deleteById(Long Id) {
		doctRep.deleteById(Id);

	}

	@Override
	public void update(doctorando p) {
		doctRep.save(p);
	}

	public List<doctorando> findBynombre(String nombre) {
		return doctRep.findBynombre(nombre);
	}

	@Override
	public int CantDoct() {

		return doctRep.findAll().size();
	}
}
