package com.kn.arrays;

import java.util.Scanner;

public class TwoDarraySumDemo {
	public static void main(String[] args) {
		System.out.println(" enter the size of the element");
		Scanner scan = new Scanner(System.in);
		 int [][]arr = new int [scan.nextInt()][scan.nextInt()];
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(" enter the array"+(i+1));
			 for(int j=0;j<arr[i].length;j++) {
				 arr[i][j]=scan.nextInt();
			 }
		 }TwoDarraySum arrysum =new TwoDarraySum();
		 arrysum.twodarraysum(arr);
		 
		 
		 
	}

}
