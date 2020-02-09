package com.bridgelabz.powercalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.powercalculator.dao.CalculatorDAO;
import com.bridgelabz.powercalculator.service.CalculatorService;;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/powercalculator")
@RestController

public class PowerCalController {
	
	@Autowired
	CalculatorService service;

	@PostMapping("/computepower")
	
	public int registration(@RequestBody CalculatorDAO numberDTO) {
		
		System.out.println("Controller calls");
		int response = service.calculate(numberDTO);
		return response;
	}

}
