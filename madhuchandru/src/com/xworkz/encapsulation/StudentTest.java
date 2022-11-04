package com.xworkz.encapsulation;

public class StudentTest {
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println(student.getName());
		
		student.setName("Raj");
		student.setUsn("1CS001");
		student.setCollege("Xworkz");
		student.setAge(200);
		
		System.out.println("student Name :"+student.getName());
		System.out.println("student USN :"+student .getUsn());
		System.out.println("student college :"+student .getCollege());
		System.out.println("student Age :"+ student.getAge());
		
	}

}
