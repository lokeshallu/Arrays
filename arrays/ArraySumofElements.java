package com.kn.arrays;

import java.util.Scanner;

public class ArraySumofElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int []arr=new int [scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" enter the values");
			arr[i]= scan.nextInt();
			
		
		}
		ArraySumofElementsDemo sumofArrayElements =new ArraySumofElementsDemo ();
		System.out.println(" The sum of elements"+sumofArrayElements.elementssum(arr));
		scan.close();

	}

		
	}


