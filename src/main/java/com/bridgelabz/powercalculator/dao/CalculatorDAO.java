package com.bridgelabz.powercalculator.dao;

public class CalculatorDAO {
	
	private int number;
	private int expValue;
	
	public int getBaseValue() {
		return number;
	}
	public void setBaseValue(int number) {
		this.number = number;
	}
	public int getExponentValue() {
		return expValue;
	}
	public void setExponentValue(int expValue) {
		this.expValue = expValue;
	}

}
