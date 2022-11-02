package com.xworkz.interfaces.looscoupling;

public class LoosCouplimgDemo1 {
	public static void main(String[] args) {
		Book1 book1=new Book1();
		Book2 book2=new Book2();
		Subject subject = new Subject();
		
		subject.startReading(book2);
	
	}

}
