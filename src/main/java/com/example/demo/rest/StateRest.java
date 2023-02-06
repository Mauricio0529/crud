package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.State;
import com.example.demo.service.StateService;

/*se comunica con el frontend, mostrar la informacion de la logia del service.
 * */ 
@RestController // CONTROLADOR
@RequestMapping("/state/")
public class StateRest {
	
	@Autowired
	private StateService stateService;
	
	// instanciamos la operacion listar (obtener) del StateService
	
	/*
	 * Obtener los estados del pais que el usuario a seleccionado
	*/
	@GetMapping("{id}") // getMapping recibe un parametro
	private ResponseEntity<List<State>> getAllStateByCountry(@PathVariable("id") int idCountry) { // @PathVariable: limpiar la variable
		// listar los estados de un pais
		return ResponseEntity.ok(stateService.findAllByCountry(idCountry));
	}
}

/*
 * NOTA: EN EL REST SE CONSUME LA LOGICA DE LAS CLASES SERVICE, PARA MOSTRAR LAS OPERACIONES EN EL FRONT-END
*/