package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
        
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/NewFile.xml");
//       lifecycle -> bean -> init , destroy  ->  using method (xml) , interface method, annotation method
		context.registerShutdownHook();
//		
//        Momo b1 =  context.getBean("b1",Momo.class);
//        System.out.println(b1);
//        System.out.println("------------");
//        Coke p1 = (Coke) context.getBean("p1");
//        System.out.println(p1);
//        System.out.println("+++++++++++++");
        Annot a1 = (Annot) context.getBean("a1");
        System.out.println(a1);

	}
	
}
