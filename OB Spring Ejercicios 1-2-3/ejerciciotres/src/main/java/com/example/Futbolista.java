package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Futbolista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String nacionalidad;
	private String equipo;

	public Futbolista() {
	}

	public Futbolista(Long id, String nombre, String nacionalidad, String equipo) {
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.equipo = equipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Futbolista [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", equipo=" + equipo
				+ "]";
	}

}
