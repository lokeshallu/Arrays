package com.kn.arrays;

import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("size of the array");
		int arr[]=new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the "+(i+1)+" element");
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the element to be found");
		int element =scan.nextInt();
		
		
		binary(arr,element);
		scan.close();
		}
	
	public static void binary(int[] arr,int element){
	
	boolean isfind = false;
			int low=0,high=arr.length-1;
		int mid=0;
			while(low<=high) {
				 mid = (low+high)/2;
				
				
				if(element == arr[mid]) {
					isfind=true;
					break;
					
				  }else if
                   (element>arr[mid]) {
						low =mid+1;
						
					}else {
						high=mid-1;
						
					}
				}if(isfind) {
					System.out.println(" value"+mid);
				}else {
					System.out.println("not found");
				}
				
				
	}
				
				
	}
		
	

	


