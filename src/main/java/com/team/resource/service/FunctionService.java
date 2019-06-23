package com.team.resource.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.team.resource.domain.Function;
import com.team.resource.repository.FunctionRepository;

/**
 * The service implementation for function repository
 */
@Service
public class FunctionService {

	private FunctionRepository repository;

	public FunctionService(FunctionRepository repository) {
		this.repository = repository;
	}

	/**
	 * To save function
	 * 
	 * @param function
	 * @return saved function
	 */
	public Function saveFunction(Function function) {
		return repository.save(function);
	}

	/**
	 * To find function by id
	 * 
	 * @param functionId
	 * @return function
	 */
	public Function find(long functionId) {
		boolean exists = repository.existsById(functionId);
		if (exists)
			return repository.getOne(functionId);
		return null;
	}

	/**
	 * Get all functions
	 * 
	 * @return list of function
	 */
	public List<Function> findAll() {
		return repository.findAll();
	}

	/**
	 * To delete function
	 * 
	 * @param functionId
	 */
	public void delete(long functionId) {
		if (repository.existsById(functionId)) {
			repository.deleteById(functionId);
		}
	}

}
