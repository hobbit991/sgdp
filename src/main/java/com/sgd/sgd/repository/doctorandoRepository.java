package com.sgd.sgd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgd.sgd.entities.doctorando;

public interface doctorandoRepository extends JpaRepository<doctorando, Long> {
	@Query(value = "select * from doctorando d where d.nombre like %:nombre%", nativeQuery = true)
	public List<doctorando> findBynombre(String nombre);
}
