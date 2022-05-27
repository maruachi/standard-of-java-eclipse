package Scratch;

class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class Main {
	public static void main(String[] args) {
		Student student = new Student("donggyu", 30);
		
		System.out.println(student);
	}	
}