package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.lifecycle.Momo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Configg.xml");
        Addition student1 =  context.getBean("add", Addition.class);
//        Student student2 = (Student) context.getBean("student2");
//        Student student3 = (Student) context.getBean("student3");
        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        
//        Momo m1 = (Momo) context.getBean("b1");
//        System.out.println(m1);
//        context.registerShutdownHook();
        
        
        
    }
}
