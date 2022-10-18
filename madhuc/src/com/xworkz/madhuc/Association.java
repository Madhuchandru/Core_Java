package com.xworkz.madhuc;

public class Association {

	public static void main(String[] args) {
		Man animal = new Man();
		animal.name = "madhuchandru";
		animal.nooflegs = 2;
		//animal.humheart = new Humheart();
		//animal.humheart.blod = "b";
		//animal.humheart.color="red";

		//System.out.println("Man name : " +" "+ animal.name+" "+"blod group:"+animal.humheart.blod+" "+"blod color is:"+animal.humheart.color+" "+"animal no of legs"+" "+animal.nooflegs);
	//	System.out.println("Humheart color : " + animal.humheart.color);
	//	System.out.println("nooflegs : + " + animal.nooflegs);
         Humheart humheartdetailes = animal.getHumheartdetailes();
         humheartdetailes.blod="b";
         humheartdetailes.color="red";
        // animal.humheart.blod="nlshs";
        // animal.humheart.color="ahldKDG";
         System.out.println(humheartdetailes.blod);
	}

}
