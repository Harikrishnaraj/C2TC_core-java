// Programs on opps concepts
package com.tns.prog;

public class OppsConcept {
	int year_ofpurchase; //datamembers or properties
	String make;
	int model;
	double cost;
	public void display1() //member function
	{
		System.out.println("year purs"+2001);
		System.out.println("make"+"suzuki");
	}
	void display2()
	{
		System.out.println("model"+1997);
		System.out.println("make"+500000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OppsConcept obj = new OppsConcept(); //object creation
		obj.display1();
		obj.display2();

	}

}