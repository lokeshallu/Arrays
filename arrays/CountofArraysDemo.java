package com.kn.arrays;

import java.util.Scanner;

public class CountofArraysDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int []arr = new int [scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}CountofArrays countofArrayss = new CountofArrays();
		countofArrayss.count(arr);
	}

}
