package com.kn.arrays;

import java.util.Scanner;

public class FourDmerggedArray {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the size of ARRAY arr");
		int []arr =new int[scan.nextInt()];
		System.out.println(" enter the size of ARRAY brr");
		int []brr =new int[scan.nextInt()];
		System.out.println(" enter the size of ARRAY crr");
		int []crr =new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" enter the size of the element1 of "+(i+1));
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<brr.length;i++) {
			System.out.println(" enter the size of the emement 2 of  "+(i+1));
			brr[i]=scan.nextInt();
		}
		for(int i=0;i<crr.length;i++) {
			System.out.println(" enter the size of the element  3 of "+(i+1));
			crr[i]=scan.nextInt();
		}
		   FourDmerggedArray2 merged=new FourDmerggedArray2();
		   int []drr=merged.printmerged(arr,brr,crr);
		   for(int i=0;i<drr.length;i++) {
			   System.out.println(drr[i]);
		   }
		
		
		
		
		
	}

}
