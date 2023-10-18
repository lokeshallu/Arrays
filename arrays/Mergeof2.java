package com.kn.arrays;

import java.util.Scanner;

public class Mergeof2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		 
		System.out.println(" enter the array size of arr");
		 int []arr=new int[scan.nextInt()];
		 
		 System.out.println("enter the array size of brr ");
		 int []brr =new int[scan.nextInt()];
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(" enter the elements 1 of "+(i+1));
			 arr[i]=scan.nextInt();
		 }
		 for(int i=0;i<brr.length;i++) {
	     System.out.println(" enter the elements 2 of "+(i+1));
	     brr[i]=scan.nextInt();
		 }
 		  Mergeof21 mergeof=new Mergeof21();
		  int[]crr= mergeof.twoarrymerge(arr,brr);
		  for(int i=0;i<crr.length;i++) {
		  System.out.println(crr[i]);
		       }

	}

}
