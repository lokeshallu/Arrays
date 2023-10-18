package com.kn.arrays;

public class SelectionShortDemo {
	public int [] selectionshort(int []arr) {
		for(int i=0;i<arr.length;i++) {
		int  min=arr[i];int index =i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<min) {
				min =arr[j];
				index = j;
			}
				
			}int temp = arr[i];
			     arr[i]=min;
			     arr[index]=temp;
			     
			    	 
			     
			}
		
		return arr;
	}

}
