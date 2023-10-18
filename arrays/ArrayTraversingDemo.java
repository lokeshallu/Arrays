package com.kn.arrays;

import java.util.Scanner;

public class ArrayTraversingDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of any array");
//		Array decleration&creation
		int []arr = new int [scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" enter the Array elemrnts"+(i+1));
			arr[i]=scan.nextInt();
			
		}
//		object calling
		ArrayTraversing arraytraversing=new ArrayTraversing();
		arraytraversing.printarryelements(arr);
		scan.close();
		
	}

}
