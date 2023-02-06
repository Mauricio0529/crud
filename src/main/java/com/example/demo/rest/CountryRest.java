package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;

@RestController
@RequestMapping("/country") // dar la url base para acceder a este servicio(clase)
public class CountryRest {

	@Autowired
	private CountryService countryService;
	
	// Se instancia la operacion del Service para obtener una lista de paises
	// estamos llamando el de obtener los datos
	@GetMapping("/getAll")
	private ResponseEntity<List<Country>> getAllCountry(){
		return ResponseEntity.ok(countryService.findAll());
	}
}

/*
 * NOTA: EN EL REST SE CONSUME LA LOGICA DE LAS CLASES SERVICE, PARA MOSTRAR LAS OPERACIONES EN EL FRONT-END
*/