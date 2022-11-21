package com.xworkz.Array;

public class LeastElementDemo {
	public static void main(String[] args) {

		char[] arr = new char[] { 'D', 'B', 'C', 'A' };
		char min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min)
				min = arr[i];

		}

		System.out.println("smallest element present in array:" + min);

	}

}
