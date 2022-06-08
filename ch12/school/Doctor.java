package school;

public class Doctor extends Person{
	private String job;
	
	public Doctor(String name, String degree, int age) {
		super(name, degree, age);
		this.job = "Doctor";
	}
	
	public void printPerson() {
		System.out.print("job = " + job + ", ");
		super.printPerson();
	}

}
