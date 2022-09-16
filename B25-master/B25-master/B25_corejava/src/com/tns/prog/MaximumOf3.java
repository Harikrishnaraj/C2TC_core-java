package com.tns.prog;

import java.util.Scanner;

class MaximumOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			System.out.println("A is greater");
		}else if(b>c){
			System.out.println("b is greater");
		}
		else if(c>a){
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("All are equal");
		}
	

	}

}
