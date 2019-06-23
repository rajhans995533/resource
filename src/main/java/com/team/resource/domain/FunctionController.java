package com.team.resource.domain;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.team.resource.service.FunctionService;

/**
 * 
 * 
 * @author hansraj
 *
 */
@RestController
@RequestMapping("function")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class FunctionController {

	private FunctionService service;

	public FunctionController(FunctionService service) {
		this.service = service;
	}

	@PostMapping
	public void save(@RequestBody Function function) {

		service.saveFunction(function);
	}

	@GetMapping("/{functionId}")
	public Function find(@PathVariable long functionId) {
		return service.find(functionId);
	}

	@GetMapping
	public List<Function> findAll() {
		return service.findAll();
	}

}
