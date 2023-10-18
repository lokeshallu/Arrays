package com.kn.arrays;

import java.util.Scanner;

public class ProductOfNumbersDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the size of an array");
		int []arr =new int [scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" enter the elements"+(i+1));
			arr[i]=scan.nextInt();
		}
		ProductOfNumbers productofnumbers =new ProductOfNumbers();
		 System.out.println(productofnumbers.theproduct(arr));

	}

	
		// TODO Auto-generated method stub
		
	

}
