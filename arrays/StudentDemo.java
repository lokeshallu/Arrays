package com.kn.arrays;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
//		Student s1 = new Student(1,"amith",66);
//		Student s2 = new Student(2,"amar",55);
//		Student s3 = new Student(3,"ammu",77);
//		
//		Student [] srr = new Student[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the how many students objects to be created ?");
		Student []srr = new Student[scan.nextInt()];
		for(int i=0;i<srr.length;i++){
			System.out.println(" Enter id for student ="+ (i+1));
			int id = scan.nextInt();
			
			System.out.println(" Enter name for student ="+ (i+1));
			String name = scan.next();
			
			System.out.println(" Enter id for student ="+ (i+1));
			int marks = scan.nextInt();
			srr[i]= new Student(id, name, marks);
			
		}for(Student s:srr) {
			System.out.println("id = " +s.id+", name= " +s.name+" ,"+ "marks =  "+ s.marks);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//  data entering manually		
//		srr[0]=s1;
//		srr[1]=s2;
//		srr[2]=s3;
//		for(int i=0;i<srr.length;i++) {
//		System.out.println("id = " +srr[i].id+", name= " +srr[i].name+" ,"+ "marks =  "+ srr[i].marks);
//     if(srr[i].name.equals("ammu")) { // compararession
//    	 System.out.println("id = " +srr[i].id+", name= " +srr[i].name+" ,"+ "marks =  "+ srr[i].marks);
//    	    
//		
		
//		if(srr[i].marks<60) {(finding the data based on the marks by giving the condition)
//    	    	 System.out.println(srr[i].name);
//    	    	 int num = 35-srr[i].marks;
//    	    	 System.out.println("Existing marks =" +srr[i].marks);
//    	    	 System.out.println("after");
////    	    	 srr[i].marks=60;
//    	    	 System.out.println("upgrade marks ="+srr[i].marks+num);
//    	     }
    	
//		bubble short
		
//    	 for(int i=0;i<srr.length;i++) {
//    		 boolean isSwapped = false;
//    		 for(int j=0;j<srr.length-i-1;j++) {
//    			 if(srr[j].marks < srr[j+1].marks) {
//    				 Student swap =srr[j];
//    				 srr[j]=srr[j+1];
//    				 srr[j+1]=swap;
//    			 }isSwapped =true;
//    			 
//    		 }if(isSwapped = false) {
//    			 break;
//    		 }
//    		 
//    	 }for(int i=0;i<srr.length;i++) {
//    	 System.out.println("id = " +srr[i].id+", name= " +srr[i].name+" ,"+ "marks =  "+ srr[i].marks);
		
		
//		binary search
		System.out.println(" enter id need to be search");
		int target = scan.nextInt();
		
		int low =0; int high = srr.length-1;int mid = 0; int position =-1;
		boolean isTargetFound = false;
		while(low <=high) {
			mid = (low + high)/2;
			if(target == srr[mid].id) {
				isTargetFound = true;
				position =mid+1;
				break;
			}else if(target <= srr[mid].id) {
				low = mid+1;
				high = high;
			}else {
				high = mid-1;
				low = low;
			}
		}if(isTargetFound) {
			System.out.println("id = " +target+", name= " +target+" ,"+ "marks =  "+ target);
		
			System.out.println("id = " +srr[position-1].id+", name= " +srr[position-1].name+" ,"+ "marks =  "+ srr[position-1].marks);
		}else {
			System.out.println("id = " +target+", name= " +target+" ,"+ "marks =  "+ target);
		}
		
    	 
    	 
    	 }
	

}
