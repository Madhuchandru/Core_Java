package com.xworkz.encapsulation;

public class BankaccountTest {
	public static void main(String[] args) {
		Bankaccount bankaccount =new Bankaccount();
				
		bankaccount.setAccountholder("madhuchandru");
		bankaccount.setAccountnumber(24368);
		bankaccount.setIfsccode("CNRB001");
		
		
		System.out.println("bankaccount Accountholder:"+ bankaccount.getAccountholder());
		System.out.println("bankaccount Accountnumber:"+ bankaccount.getAccountnumber());
		System.out.println("bankaccount Ifsccode:"+ bankaccount.getIfsccode());
		
	}

}
