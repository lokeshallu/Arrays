package com.kn.arrays;

import java.util.Scanner;

public class MergeElementsDemo {
	public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the size of Array Arr");
   int [] arr = new int[scan.nextInt()];
   System.out.println("Enter the size of array Brr");
   int[] brr = new int[scan.nextInt()];
   System.out.println("Enter the size of Array Crr");
   int[] crr = new int[scan.nextInt()];
   System.out.println("===>In Array Arr");
   for(int i=0;i<arr.length;i++) {
	   arr[i]=scan.nextInt();
   }
   for(int  i=0;i<brr.length;i++) {
	   brr[i]=scan.nextInt();
   }
   for(int i =0;i<crr.length;i++) {
	   crr[i]=scan.nextInt();
   }
   int[] drr=MergeThreeArray(arr,brr,crr);
   //Traversing
   for(int i =0;i<drr.length;i++) {
	   System.out.println(drr[i]+ " ");
   }
   
	   
   }

	 static int[] MergeThreeArray(int[] arr, int[] brr, int[] crr) {
		 int[] drr=new int[arr.length+brr.length+crr.length];
		 for(int i =0;i<arr.length;i++) {
			 drr[i]=arr[i];
		 }
		 for(int i =0;i<brr.length;i++) {
			 drr[arr.length+i]=brr[i];
		 }
		 for(int i=0;i<crr.length;i++) {
			 drr[arr.length+brr.length+i]=crr[i];
		 }
		return drr;
         		
	}

	
}
