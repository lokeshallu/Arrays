package com.kn.arrays;

public class BubbleshortArrayDemo {
	

	public int [] bubble(int []arr) {
//		boolean isfount =false;
		int count =0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				 count=1;
				}
			}if(count==0) {
				System.out.println(" is sorted ");
				break;
				
			}
		}
		return arr;
		
	}

}
