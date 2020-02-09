package com.bridgelabz.powercalculator.service;

import com.bridgelabz.powercalculator.dao.CalculatorDAO;

public interface ICalculatorService {
	int calculate(CalculatorDAO numberDTO);
}

