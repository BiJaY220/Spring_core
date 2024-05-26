package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/NewFile.xml");
		Person per = context.getBean("person1",Person.class);
		System.out.println(per);
		//System.out.println(per.getClass().getName());
		System.out.println("_________________________________________");
		Person pers = context.getBean("person2",Person.class);
		System.out.println(pers);
		System.out.println("_________________________________________");
		Person perss = context.getBean("person3",Person.class);
		System.out.println(perss);
	}

}
