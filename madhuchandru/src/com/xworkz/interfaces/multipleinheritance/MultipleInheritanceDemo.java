package com.xworkz.interfaces.multipleinheritance;

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		TaxCalculator taxcalculator=new TaxCalculator();
		taxcalculator.electricityTax();
		taxcalculator.incomeTax();
	}

}
