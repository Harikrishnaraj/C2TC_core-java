package com.tns.prog;

import java.util.Scanner;

public class P_N_Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		if(number>0) {
			System.out.println("Number is positive:"+number);
		}
		if(number<0) {
			System.out.println("Number is negative:"+number);
		}
		else if(number==0){
			System.out.println("Number is zero:"+number);
		}
	}

}
