package com.xworkz.methodoverloading;

public class Human1Test{

	public static void main(String[] args) {
		Human1 shruthi = new Human1();
		Unknown unknown = new Unknown();
		Friend friend = new Friend();
		shruthi.speak(unknown);
		shruthi.speak(friend);
	}

}