package com.xworkz.interfaces.multipleinheritance;

public class TaxCalculator implements StateTax, CentralTax{
	public void incomeTax() {
		System.out.println("Income tax is 100 Rs");
		
	}

	
	public void electricityTax() {
		System.out.println("Electricity tax is 50 Rs");
		
	}
	

}
