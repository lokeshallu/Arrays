package com.kn.arrays;

import java.util.Scanner;

public class Passoword {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		String usagerName =scan.next();
		String password =scan.next();
		String conformpassword = scan.next();
		
		
		boolean iscorrect =correct(usagerName,password,conformpassword);
		System.out.println(iscorrect);
	}

	 private static boolean correct(String usagerName, String password, String conformpassword) {


		 boolean iscorrect =false;
		if(usagerName.length()>=5 && usagerName.length() <=12) {
		
			if(password.length()>=5 && password.length()<=12 &&    password.equals(conformpassword)) {
		              iscorrect =true;
		              
			
		}
		
	}
		return iscorrect;

	 }}
