package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "state") // TABLA HIJA DE PERSONA
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // sea el Id auto incrementable
	private int IdState;
	
	@ManyToOne
	@JoinColumn(name = "IdCountry") // 1 pais puede contener muchos estados y un estado tiene un pais
	private Country country; // para ver el estado donde vive, primero hay que saber de que pais es
	private String nameState;

	/*
	 * Nota: no se hace la relacion en las tablas hijas, ya que las relaciones se hacen en la tabla principal (Padre)
	*/
	
	public State() {
	}

	public State(Country country, String nameState) {
		super();
		this.country = country;
		this.nameState = nameState;
	}

	public int getIdState() {
		return IdState;
	}

	public void setIdState(int idState) {
		IdState = idState;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getNameState() {
		return nameState;
	}

	public void setNameState(String nameState) {
		this.nameState = nameState;
	}
}