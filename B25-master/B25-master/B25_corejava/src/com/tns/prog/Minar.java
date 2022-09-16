package com.tns.prog;

import java.util.Scanner;

public class Minar

{

	public static void main(String[]args)

	{

		Scanner inp = new Scanner(System.in);

		for(int tunnel = 1; tunnel <= 7; tunnel++)

		{

			System.out.println("Entering tunnel " + tunnel);

			System.out.println("Are there diamonds here? Enter only true or false");

			boolean areDiamonds = inp.nextBoolean();

			if (areDiamonds) // if true is entered by the user

			{

				System.out.println("I found diamonds in tunnel " + tunnel);

				break;

			}

			System.out.println(); // add a line for better readability

		}
	}
}
