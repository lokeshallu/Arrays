 package com.kn.arrays;

import java.util.Scanner;

public class ReverseTransveringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the size of any **array**");
		int []arr=new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("  elements"+(i+1));
			arr[i]=scan.nextInt();
		}
		ReverseTransvering reversetransversings =new ReverseTransvering();
          reversetransversings.reversetranversing(arr);
          scan.close();
	}

}
