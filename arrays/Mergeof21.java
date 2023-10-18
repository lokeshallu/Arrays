 package com.kn.arrays;

public class Mergeof21 {
	public int[]twoarrymerge(int[]arr,int[]brr){
		int []crr=new int [arr.length+brr.length];
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}for(int i=0;i<brr.length;i++) {
			crr[arr.length+i]=brr[i];
		}return crr;

}}
