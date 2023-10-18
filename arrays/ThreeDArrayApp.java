package com.kn.arrays;

import java.util.Scanner;

public class ThreeDArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array Arr");
		int[]arr=new int[scan.nextInt()];
		System.out.println("Enter the size of Array Brr");
		int[]brr=new int[scan.nextInt()];
		
		System.out.println("====>In array Arr<=====");
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" element =");
			arr[i]=scan.nextInt();
		}
		for(int i =0;i<brr.length;i++) {
			System.out.println("Enter the "+(i+1)+" element =");
			brr[i]=scan.nextInt();
		}
	    ThreeDArrayDemo threedArrayDemo =new ThreeDArrayDemo();
	    int[] crr=threedArrayDemo.MergeArray(arr, brr);
	    for(int i =0;i<crr.length;i++) {
	    	System.out.println(crr[i]+" ");
	    }
	}

}
