package com.kn.arrays;



public class ArrayFindingDemo {
	public void isdemo(int[] arr,int element){
	
		
		boolean isfind=false;
		int low=0,high=arr.length-1,mid=0;
		while(low<=high) {
			 mid = (low+high)/2 ;
		
		if(element==arr[mid]){
			isfind=true;
		     break;
		}
		     
		else if
			(element > mid) {
				low =mid+1;
				
			}else {
				high=mid-1;
				
			}
		}
		if(isfind) {
			System.out.println(" the value is found at index "+mid);
		}else {
			System.out.println("element not found ");
		}
		
	}
		
	}


