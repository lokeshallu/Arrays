package com.kn.arrays;

import java.util.Scanner;

public class ArrayFinding {
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
//		System.out.println(" Enter the elements in the Array");
		int []arr = {10,20,30,35,40,50,60,70,80,90,100,105};
		System.out.println("enter the element to search");
		int element =scan.nextInt();
		
		
		ArrayFindingDemo array = new ArrayFindingDemo();
//		int element =scan.nextInt();
		array.isdemo(arr,element);
		scan.close();
	}

}
