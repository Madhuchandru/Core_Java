package com.xworkz.madhuchandru;

public class HasARealationship1 {

	public static void main(String[] args) {
   Human boy=new Human();
   boy.name ="madhuchandru";
   boy.numberofeyes=2;
   boy.numberofheart=1;
   boy.heart =new Heart();
   
   System.out.println("nanna name:             "+ boy.name);
   System.out.println("nanna heart color:      "+ boy.heart.color);
	System.out.println("nanna blood group:     "+ boy.heart.blod);
	System.out.println("nanna heart baditha:   "+  boy.heart.nooftimepumps);
	}
}
