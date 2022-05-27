package _20220504_school;

public class Main {
	public static void main(String[] args) {
		School school = new School("gosaek");
		school.addRoom("myRoom");
		school.addStudent(0, 13, "donggyu", "master");
		school.addRoom("yourRoom");
		school.addStudent(1, 14, "ddd", "bacholor");
		school.addStudent(1, 15, "sdfdsf", "master");
		school.printAllStudent();
		
	}
}

//DB processor <-> rich client, rich software
