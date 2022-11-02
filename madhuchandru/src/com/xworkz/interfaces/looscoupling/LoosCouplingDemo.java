package com.xworkz.interfaces.looscoupling;

public class LoosCouplingDemo {
	public static void main(String[] args) {
		Sony sony=new Sony();
		Epson epson=new Epson();
		Computer computer =new Computer();
		
		computer.slot(sony);
	
	}

}
