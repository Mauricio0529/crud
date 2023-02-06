package com.example.demo.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

/*
	llamar la logica de los servicios con el rest 
	para poder comunicarlos y visualizarlos
	en el Front-end
*/

/*
 * EN ESTA CLASE REST ES LA PRINCIPAL, ES LA QUE VAN ESTAR TODAS LAS OPERACIONES DEL CRUD
 * */

@RestController
@RequestMapping("/person/")
public class PersonRest {

	@Autowired
	private PersonService personService;
	
	// listar personas
	@GetMapping
	private ResponseEntity<List<Person>> getAllPerson(){
		return ResponseEntity.ok(personService.findAll());
	}
	
	// Guardar o registrar una persona
	@PostMapping
	private ResponseEntity<Person> savePerson(@RequestBody Person person){
		try {
			Person personSave = personService.save(person);
			return ResponseEntity.created(new URI("/person/"+personSave.getIdPersona())).body(personSave); // el body retorna los datos al frontend	
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	// elimina una persona por id
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> deletePerson(@PathVariable("id") int idPerson){
		// se elimina la persona
		personService.deleteById(idPerson);
		
		// retorna true si se elimino de lo contrario se retorna no false
		/* se busca la persona por id para verificar si se encuentra en la base de datos, 
		 * se esta condicionando si la persona ha sido eliminada
		 */
		return ResponseEntity.ok(!(personService.findById(idPerson)!=null));
	}
	
}