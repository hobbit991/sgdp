package com.sgd.sgd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgd.sgd.entities.doctor;

public interface doctorRepository extends JpaRepository<doctor, Long> {
	@Query(value = "select * from doctor d where d.nombre like %:nombre%", nativeQuery = true)
	public List<doctor> findBynombre(String nombre);

}
