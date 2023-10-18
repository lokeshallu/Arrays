package com.kn.arrays;

import java.util.Scanner;

public class BubbleShort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the size of the array");
		int arr[]=new int [scan.nextInt()];
		
//		System.out.println(" enter the elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(" enter the elements"+(i+1));
			arr[i]=scan.nextInt();
		}
		System.out.println(" <<<<<<<<<<<<  Before shorted >>>>>>>>>>>  ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
		System.out.println(" <<<<<<<<<<<<< After shorted >>>>>>>>>>>>>>>  ");
		BubbleShortDemo doubleshort = new BubbleShortDemo();
		doubleshort.printshortingarray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
