package _20220504_school;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Room {
	private final List<Student> students = new ArrayList<>();
	private final int roomId;
	private final String name;
	
	public Room(int roomId, String name) {
		this.roomId = roomId;
		this.name = name;
	}
	
	public void addStudent(int age, String name, String degree) {
		Student student = new Student(age, name, degree);
		students.add(student);
	}
	
	public void printStudents() {
		for(int i = 0; i < students.size(); i++) {
			students.get(i).printStudent();
		}
	}
	
	public void printRoom() {
		System.out.println(MessageFormat.format("RoomId: {0} name: {1}", this.roomId, this.name));
	}
}
