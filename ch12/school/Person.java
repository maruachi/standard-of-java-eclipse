package school;
//school room person
//school 2 room name
//room 5 person name id
//person name degree age
//indexing -> print

public class Person {
	private String name;
	private String degree;
	private int age;
	
	public Person(String name, String degree, int age) {
		this.name = name;
		this.degree = degree;
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println("name = " + this.name + ", degree = " + this.degree + ", age = " + this.age);
	}
	
	public boolean detDegree(String degree) {
		return this.degree.equals(degree);
	}
}
