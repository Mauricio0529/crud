package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person") // TABLA PRINCIPAL
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // sea el Id auto incrementable
	private int idPersona;
	
	// @Column(name = "nombre", length = 30)
	private String nombre;
	
	// @Column(name = "apellido", length = 30)
	private String apellido;
	
	// @Column(name = "edad", length = 5)
	private int edad;

	@ManyToOne // personas puede tener un pais de nacimiento, y un pais puede tener muchos (1 pais a muchas personas) uno a muchos
	@JoinColumn(name = "IdCountry") // es como crear la llave foranea de la tabla que se relaciona. 
	private Country country;
	
	@ManyToOne
	@JoinColumn(name = "IdState") // llave foranea de la tabla que se relaciona.
	private State state;
	
	/*
	 * Nota: no se hace la relacion en las tablas hijas, ya que las relaciones se hacen en la tabla principal (Padre)
	*/

	public Person() {
	}
	
	public Person(String nombre, String apellido, int edad, Country country, State state) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad; // me daba el error por que no estaba llamando la variable edad
		this.country = country;
		this.state = state;
	}
	
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}


/*
 VAMOS HACER UNA TABLA DONDE ME MUESTRE NOMBRE,APELLIDO, EDAD, 
 LOS DATOS PERSONALES SE GUARDAN EN ESTA TABLA PRINCIPAL,
 LUEGO VAMOS A CREAR DOS TABLAS (PAIS,ESTADO) DONDE ESTAS SE RELACIONARAN CON LA TABLA PRINCIPAL PERSONA
 PARA ASI ENTENDER LAS RELACIONES ENTRE TABLAS, 
 ASI SE RELACIONAN LOS DATOS DE UNA PERSONA EN TABLAS RELACIONALES. 
 
 HIBERNATE = > PARA LAS QUERY CONSULTAS SQL
 SINGLETON
 MOC PARA HACER TEST
 
*/