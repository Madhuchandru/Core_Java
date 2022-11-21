package com.xworkz.typecasting;

public class DowCasting {
	public static void main(String[] args) {
		Tree tree =new Mango();
		Mango mango =(Mango)tree;
		
		mango.provideoxygen();
		mango.providesMangoFruits();
		
	}

}
