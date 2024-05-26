package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
        
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/NewFile.xml");
//       Student std =(Student) context.getBean("student");
//       System.out.println(std);
		// linkage of two objects of dependent classes -> A - B -> XML(no , byName , byType , constructor) , 
		// Annotation -> above variable , above setter , above constructor(@autowired) 
       Teacher teach = context.getBean("teaching", Teacher.class);
       System.out.println(teach);
		
       

	}
	
}
