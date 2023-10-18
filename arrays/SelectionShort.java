package com.kn.arrays;

import java.util.Scanner;

public class SelectionShort {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		//ARRAY DECLERATION & CREATION
		
		System.out.println(" >>>>>>>> Enter the size of the array ");
		int arr[]= new int [scan.nextInt()];
		
		//array inotilization
		
		System.out.println(">>>>>>>>> Enter the values >>>>>>>>");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		//object creation
		
		System.out.println(" <<<<<<<< before selectionshorting >>>>>>>>>");
		SelectionShortDemo demo = new SelectionShortDemo();
		for(int i :arr) {
			System.out.print(i+"   ");
		}
		//method calling
		System.out.println("      ");
		System.out.println(" <<<<<<<<<< after selectionshorting >>>>>>>>");
		demo.selectionshort(arr);
		for(int i=0;i<arr.length;i++) {
	     System.out.print(arr[i]+ "   ");
		
		}
         }
		
	}


