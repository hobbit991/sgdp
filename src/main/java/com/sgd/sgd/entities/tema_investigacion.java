package com.sgd.sgd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tema_investigacion")
public class tema_investigacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tema", nullable = false)
	private Long id_tema;
	@Column(name = "nombre", nullable = false)
	private String nombre;

	public tema_investigacion(Long id_tema, String nombre_tema) {

		this.id_tema = id_tema;
		this.nombre = nombre_tema;
	}

	public tema_investigacion() {

	}

	public Long getId_tema() {
		return id_tema;
	}

	public void setId_tema(Long id_tema) {
		this.id_tema = id_tema;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNombre_tema(String nombre_tema) {
		this.nombre = nombre_tema;
	}

	@OneToOne(mappedBy = "t")
	doctorando d;

	public doctorando getD() {
		return d;
	}

	public void setD(doctorando d) {
		this.d = d;
	}

}
