package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{


}
/*
 * NOTA: LOS REPOSITORY SON TODAS LAS SENTENCIAS DE BD, OPERACIONES SQL O (INSERTAR, MODIFICAR, ELIMINAR, ETC., de JPA).
 * EN SERVICE ES LA LOGICA QUE SE DARA A LAS FUNCIONES O METODOS QUE TIENE REPOSITORY
 * */
 