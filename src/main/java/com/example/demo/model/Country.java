package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "country") // TABLA HIJA DE STATE Y PERSONA
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // sea el Id auto incrementable
	private int IdCountry;
	
	// @Column(name = "nameCountry", length = 30)
	private String nameCountry;
	
	/*
	 * Nota: no se hace la relacion en las tablas hijas, ya que las relaciones se hacen en la tabla principal (Padre)
	*/
	
	public Country() {
	}
	
	public Country(String nameCountry) {
		super();
		this.nameCountry = nameCountry;
	}

	public int getIdCountry() {
		return IdCountry;
	}

	public void setIdCountry(int idCountry) {
		IdCountry = idCountry;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}
}