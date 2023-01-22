package com.sgd.sgd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgd.sgd.entities.solicitante;
import com.sgd.sgd.repository.solicitanteRepository;

@Service

public class solicitanteServiceImp implements solicitanteService {

	public solicitanteRepository solServ;

	@Autowired
	protected solicitanteServiceImp(solicitanteRepository SolServ) {

		solServ = SolServ;
	}

	@Override
	public List<solicitante> findAll() {

		return solServ.findAll();
	}

	@Override
	public solicitante findById(Long Id) {

		return solServ.findById(Id).get();
	}

	@Override
	public void save(solicitante s) {
		solServ.save(s);

	}

	@Override
	public void deleteById(Long Id) {
		solServ.deleteById(Id);

	}

	@Override
	public void update(solicitante s) {
		solServ.save(s);

	}

	public List<solicitante> findBynombre(String nombre) {
		return solServ.findBynombre(nombre);
	}

	@Override
	public int CantSol() {

		return solServ.findAll().size();
	}
}
