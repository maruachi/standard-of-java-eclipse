package _20220504_school;

import java.text.MessageFormat;

public class Student {
	private final int age;
	private final String name;
	private final String degree;
	
	public Student(int age, String name, String degree) {
		this.age = age;
		this.name = name;
		this.degree = degree;
	}
	
	public void printStudent() {
		System.out.println(MessageFormat.format("age: {0} name: {1} degree {2}", 
				this.age, this.name, this.degree));
	}
}
