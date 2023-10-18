package com.kn.arrays;

public class BubbleShortDemo {
	public int [] printshortingarray(int [] arr) {
		
		
		int temp=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1 -i;j++) {
				if(arr[j]>arr[j+1]) {
					temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count=1;
				}
					
			}if(count==0) {
			System.out.println("*********** ");
			break;}
		}return arr;
	}
 
}
