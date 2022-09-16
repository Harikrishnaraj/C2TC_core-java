package com.tns.prog;

import java.util.Scanner;

class IsMultipleOf3
{

	public static void main(String[] args)
	{
		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);

		// Numerical data input
		int num = sc.nextInt();

		// using modulo division operator if the output of num%3
		// is equal to 0 then it is considered as multiple of 3
		// otherwise not a multiple of 3
		if (num % 3 == 0)
		{
			System.out.println(" is multiple of 3");
		}
		else
		{
			System.out.println(" is not multiple of 3");
		}
	}
}