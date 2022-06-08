package school;

public class Lawer extends Person{
	private String job;
	
	public Lawer(String name, String degree, int age) {
		super(name, degree, age);
		this.job = "Lawer";
	}
	
	public void printPerson() {
		System.out.print("job = " + job + ", ");
		super.printPerson();
	}

}
