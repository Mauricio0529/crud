package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.demo.model.State;
import com.example.demo.repository.StateRepository;

// se hace la logica
@Service
public class StateService implements StateRepository{
	
	@Autowired
	private StateRepository stateRepository;

	// Metodos que utiliza el JPA
	@Override
	public List<State> findAll() {
		return stateRepository.findAll();
	}

	// obtenemos los estados de un pais
	public List<State> findAllByCountry(int idCountry){
		List<State> stateChosen = new ArrayList<>(); // se guardara los estados de un pais elegido
		List<State> state = stateRepository.findAll(); // obtenemos todos los estados
		for(int i = 0; i < state.size(); i++) {
			if(state.get(i).getCountry().getIdCountry() == idCountry) {
				stateChosen.add(state.get(i)); // se obtiene los estado del pais y se agrega a la nueva lista
			}
		}
		return stateChosen;
	}
	
	@Override
	public List<State> findAll(Sort sort) {
		return null;
	}

	@Override
	public List<State> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends State> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<State> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<State> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<State> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(State entity) {
		stateRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll(Iterable<? extends State> entities) {
		stateRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		stateRepository.deleteAll();
	}

	@Override
	public <S extends State> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends State> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends State, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}