package com.sgd.sgd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_doctor", nullable = false)
	private Long id_doctor;
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
	@Column(name = "titulo", nullable = false)
	private String titulo;

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

	public String getArea_conocimiento() {
		return area_conocimiento;
	}

	public void setArea_conocimiento(String area_conocimiento) {
		this.area_conocimiento = area_conocimiento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public doctor(Long id_doctor, String nombre, String apellidos, Long ci, String sexo, String estado_civil,
			String area_conocimiento, String titulo) {

		this.id_doctor = id_doctor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ci = ci;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
		this.area_conocimiento = area_conocimiento;
		this.titulo = titulo;

	}

	public doctor() {

	}

	public Long getId_doctor() {
		return id_doctor;
	}

	public void setId_doctor(Long id_doctor) {
		this.id_doctor = id_doctor;
	}

}
