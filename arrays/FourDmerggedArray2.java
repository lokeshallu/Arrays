package com.kn.arrays;

public class FourDmerggedArray2 {
	public int[]printmerged(int []arr,int []brr,int[]crr){
		int drr[]=new int [arr.length+brr.length+crr.length];
		for(int i=0;i<arr.length;i++) {
			drr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			drr[arr.length+i]=brr[i];
		}
		for(int i=0;i<crr.length;i++) {
			drr[arr.length+brr.length+i]=crr[i];
		}
		return drr;

}}
