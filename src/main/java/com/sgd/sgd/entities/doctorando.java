package com.sgd.sgd.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doctorando")

public class doctorando {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_doctorando", nullable = false)
	private Long id_doctorando;
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
	@Column(name = "fecha_predefensa", nullable = false)
	private Date fecha_predefensa;
	@Column(name = "fecha_defensa", nullable = false)
	private Date fecha_defensa;

	protected doctorando(Long id_doctorando, String nombre, String apellidos, String sexo, String estado_civil,
			String area_conocimiento, Date fecha_predefensa, Date fecha_defensa) {

		this.id_doctorando = id_doctorando;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
		this.area_conocimiento = area_conocimiento;
		this.fecha_predefensa = fecha_predefensa;
		this.fecha_defensa = fecha_defensa;
	}

	public doctorando() {

	}

	@OneToOne
	tema_investigacion t;

	public Long getId_doctorando() {
		return id_doctorando;
	}

	public void setId_doctorando(Long id_doctorando) {
		this.id_doctorando = id_doctorando;
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

	public String getArea_conocimiento() {
		return area_conocimiento;
	}

	public void setArea_conocimiento(String area_conocimiento) {
		this.area_conocimiento = area_conocimiento;
	}

	public Date getFecha_predefensa() {
		return fecha_predefensa;
	}

	public void setFecha_predefensa(Date fecha_predefensa) {
		this.fecha_predefensa = fecha_predefensa;
	}

	public Date getFecha_defensa() {
		return fecha_defensa;
	}

	public void setFecha_defensa(Date fecha_defensa) {
		this.fecha_defensa = fecha_defensa;
	}

	public tema_investigacion getT() {
		return t;
	}

	public void setT(tema_investigacion t) {
		this.t = t;
	}
}
