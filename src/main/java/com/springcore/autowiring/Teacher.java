package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Teacher {
	//<ref obj>
	//parameter -> object ko dependency autowire 
	//autowire ->xml method ->no, ->byName ,->byType , ->constructor 
	//         -> annotation ->@Autowired
	
	private Student student; // this obj name must match with the bean name while using the type byName

	public Student getStudent() {
		return student;
	}

	@Autowired
	@Qualifier("student1")
	public void setStudent(Student student) {
		System.out.println("setting process!");
		this.student = student;
	}

	

	@Override
	public String toString() {
		return "Teacher [student=" + student + "]";
	}

	public Teacher(Student student) {
		super();
		this.student = student;
		System.out.println("with constructor");
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
