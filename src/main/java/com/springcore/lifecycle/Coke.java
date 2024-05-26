package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coke implements InitializingBean, DisposableBean{
	public double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coke [price=" + price + "]";
	}

	public Coke(double price) {
		super();
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("taking coke");// init method
	}

	public Coke() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
	
	

}
