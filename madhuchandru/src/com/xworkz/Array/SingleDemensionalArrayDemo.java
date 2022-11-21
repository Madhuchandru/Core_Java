package com.xworkz.Array;

public class SingleDemensionalArrayDemo {
	public static void main(String[] args) {
		int arr[] =new int[8];
		int num = 100;
		for (int i=0;i<arr.length;i++) {
			arr[i]=num;
			num=num+10;
			System.out.println(num);
		}
		System.out.println("-----------");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
