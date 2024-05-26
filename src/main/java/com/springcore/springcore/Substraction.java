package com.springcore.springcore;

public class Substraction {
	private int a;
	private int b;
	public Substraction(double a , double b) {
		this.a= (int) a;
		this.b = (int) b;
		System.out.println("Constructor double double");
		
	}
	public Substraction(int a , int b) {
		this.a= a;
		this.b = b;
		System.out.println("Constructor int int");
		
	}
	public Substraction(String a , String b) {
		this.a= Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor string  string");
		
	}
	public void sub() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("substraction :"+(this.a-this.b));
	}
//	public void init()
//	
//	public void delete()
//xml method , annotation method and configuration method 

}
