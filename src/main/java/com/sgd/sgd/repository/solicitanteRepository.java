package com.sgd.sgd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgd.sgd.entities.solicitante;

public interface solicitanteRepository extends JpaRepository<solicitante, Long> {
	@Query(value = "select * from solicitante s where s.nombre like %:nombre%", nativeQuery = true)
	public List<solicitante> findBynombre(String nombre);

}
