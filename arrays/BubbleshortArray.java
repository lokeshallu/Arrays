package com.kn.arrays;

import java.util.Scanner;

public class BubbleshortArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println(" enter the size of the array");
//		ARRAY DECLERATION && CREATION
		
		int []arr = new int[scan.nextInt()];
		
//		ARRAY INITILIZATION
		
		for(int i=0;i<arr.length;i++) {
	    System.out.print(" enter the elements :"+(i+1)+"    ");
	    arr[i]=scan.nextInt();
			
			
		}System.out.println(" ---------------------  before shorted-------------");
//		 for(int i=0;i<arr.length;i++ ) {
//	     System.out.println(arr[i]);
//		}
		// OBJECT
		
			BubbleshortArrayDemo bubblearray = new BubbleshortArrayDemo();
//			bubblearray.bubble(arr);
			for(int i :arr) {
				System.out.println(i );
			}	
			System.out.println("--------------- after shorted ------------");
			bubblearray.bubble(arr);
			for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}}


