package com.springcore.lifecycle;

import org.springframework.util.SystemPropertyUtils;

public class Momo {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setting process !");
		this.price = price;
	}

	public Momo(double price) {
		super();
		this.price = price;
	}

	public Momo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Momo [price=" + price + "]";
	}
	public void init() {
		System.out.println("first initilization !");
	}
	public void destroy() {
		System.out.println("final removal! ");
	}
}
