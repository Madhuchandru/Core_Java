package com.xworkz.Array;

public class PresentOrNot {
	public static void main(String[] args) {

		String[] arr = new String[] { "apple","orange","banana","mango","chiko","jackfruit"};
		String min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			
		}

			if (arr[i] < min)
				min = arr[i];

		}

		System.out.println("smallest element present in array:" + min);

	}




