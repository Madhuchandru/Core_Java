package com.xworkz.madhuc;

public class HasARelationshipDemo {

	public static void main(String[] args) {
Library sharada =new Library();

sharada.name="Sharada";
sharada.noofBooks =100;
sharada.location="Bengaluru";
sharada.student=new Student();
System.out.println("Library name : "+ sharada.name);
System.out.println("student name : "+ sharada.student.name);
System.out.println("student.id : "+ sharada.student.id);
System.out.println("student college : "+ sharada.student.college);


	}

}
