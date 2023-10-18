package com.kn.arrays;

public class TwoDarraySum {
	public static void twodarraysum(int[][]arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum = sum+arr[i][j];
//				System.out.println(sum);
				
			}
		}System.out.println(sum);
		

}}
