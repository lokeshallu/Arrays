package com.kn.arrays;

import java.util.Scanner;

public class InserctionSort {
	public static void main(String []args){
	Scanner scan = new Scanner(System.in);
		int []arr = {70,47,73,43,46};
		
		System.out.println(" ------------before sorted------");
		InserctionSortDemo sort = new InserctionSortDemo();
		for(int i:arr) {
			System.out.println(" "+i);
			
		}System.out.println("--------- after sorted----------");
		sort.inserctionsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
