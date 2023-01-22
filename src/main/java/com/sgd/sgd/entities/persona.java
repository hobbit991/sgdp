package com.sgd.sgd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_persona", nullable = false)
	private Long id_persona;
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
	@Column(name = "categoria", nullable = false)
	private String categoria;

	public Long getId_solicitante() {
		return id_persona;
	}

	public void setId_solicitante(Long id_persona) {
		this.id_persona = id_persona;
	}

	protected persona(String nombre, String apellidos, Long ci, String sexo, String estado_civil, String categoria) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ci = ci;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
		this.categoria = categoria;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
