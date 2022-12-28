package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String sistemaOperativo;
	private double precio;
	private boolean officeInstalado;

	public Laptop() {
	}

	public Laptop(Long id, String marca, String sistemaOperativo, double precio, boolean officeInstalado) {
		super();
		this.id = id;
		this.marca = marca;
		this.sistemaOperativo = sistemaOperativo;
		this.precio = precio;
		this.officeInstalado = officeInstalado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOfficeInstalado() {
		return officeInstalado;
	}

	public void setOfficeInstalado(boolean officeInstalado) {
		this.officeInstalado = officeInstalado;
	}

}
