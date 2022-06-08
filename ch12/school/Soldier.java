package school;

public class Soldier extends Person{
	private String job;
	
	public Soldier(String name, String degree, int age) {
		super(name, degree, age);
		this.job = "Soldier";
	}
	
	public void printPerson() {
		System.out.print("!!!job = " + job + ", ");
		super.printPerson();
	}
}
