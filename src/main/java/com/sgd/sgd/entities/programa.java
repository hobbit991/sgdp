package com.sgd.sgd.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "programa")
public class programa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_programa", nullable = false)
	private Long id_programa;
	@Column(name = "nombre", nullable = false)
	private String nombre;

	@OneToMany(mappedBy = "p")
	List<solicitante> solicitantes;

	public Long getId_programa() {
		return id_programa;
	}

	public void setId_programa(Long id_programa) {
		this.id_programa = id_programa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<solicitante> getSolicitantes() {
		return solicitantes;
	}

	public void setSolicitantes(List<solicitante> solicitantes) {
		this.solicitantes = solicitantes;
	}

	public programa() {

	}

	public programa(Long id_programa, String nombre) {
		super();
		this.id_programa = id_programa;
		this.nombre = nombre;
	}

}
