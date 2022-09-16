package com.tns.prog;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Week1 temp: ");
		int temperature=sc.nextInt();
		int week=5;
		for(int i=2;i<=week;i++) {
			temperature=temperature-2;
			System.out.println("Week"+i+"-"+temperature);
		}
		System.out.println("Final temperature is: "+"Week"+week);
	}
}
