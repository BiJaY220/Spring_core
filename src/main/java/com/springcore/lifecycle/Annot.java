package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.util.SystemPropertyUtils;

public class Annot {
	
	
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Annot [name=" + name + "]";
	}

	public Annot(String name) {
		super();
		this.name = name;
	}

	public Annot() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start() {
		System.out.println("this is the starting of the annotation!");
	}
	@PreDestroy
	public void end() {
		System.out.println("this is the ending of the annotation!");
	}

}
