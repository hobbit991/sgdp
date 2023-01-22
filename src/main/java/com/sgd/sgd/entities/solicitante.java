package com.sgd.sgd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitante")

public class solicitante {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_solicitante", nullable = false)
	private Long id_solicitante;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "apellidos", nullable = false)
	private String apellidos;
	@Column(name = "ci", nullable = false)
	private Long ci;
	@Column(name = "sexo", nullable = false)
	private String sexo;
	@Column(name = "estado_civil", nullable = false)
	private String estado_civil;
	@Column(name = "area_conocimiento", nullable = false)
	private String area_conocimiento;

	public String getArea_conocimiento() {
		return area_conocimiento;
	}

	public void setArea_conocimiento(String area_conocimiento) {
		this.area_conocimiento = area_conocimiento;
	}

	public Long getId_solicitante() {
		return id_solicitante;
	}

	public void setId_solicitante(Long id_solicitante) {
		this.id_solicitante = id_solicitante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Long getCi() {
		return ci;
	}

	public void setCi(Long ci) {
		this.ci = ci;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public solicitante(String nombre, String apellidos, Long ci, String sexo, String estado_civil) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ci = ci;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
	}

	public solicitante() {
		super();
	}

	@ManyToOne
	programa p;

	public programa getP() {
		return p;
	}

	public void setP(programa p) {
		this.p = p;
	}

}
