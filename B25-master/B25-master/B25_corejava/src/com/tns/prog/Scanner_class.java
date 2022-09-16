package com.tns.prog;

import java.util.Scanner;

public class Scanner_class {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			String gender = sc.nextLine();
			int age = sc.nextInt();
			long mobileNo = sc.nextLong();
			Double cgpa=sc.nextDouble();
			 
				System.out.println("Name:"+name);
				System.out.println("Gender:"+gender);
				System.out.println("Mobile Number:"+mobileNo);
				System.out.println("CGPA:"+cgpa);
		
	}

}

