package com.bridgelabz.powercalculator.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.powercalculator.dao.CalculatorDAO;


@Service
public class CalculatorService implements ICalculatorService  {
	@Override
	public int calculate(CalculatorDAO numberDTO) {
		
		//System.out.println("CalculatorService.calculate()");
		int number = numberDTO.getBaseValue();
		int expValue = numberDTO.getExponentValue();

		System.out.println(number);
		System.out.println(expValue);

		int resultValue = 1;

		for (int i = 1; i <= expValue; i++) {
			resultValue = resultValue * number;
		}
		
		System.out.println(resultValue);
		return resultValue;
	}

}
