package com.springcore.springcore;

public class Momo {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Momo(int price) {
		super();
		this.price = price;
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
