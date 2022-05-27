package _20220504_school;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class School {
	private final String name;
	private int roomCount;
	private final List<Room> rooms = new ArrayList<>();
	
	public School(String name) {
		this.name = name;
		this.roomCount = 0;
	}
	
	public void addRoom(String name) {
		Room room = new Room(roomCount++, name);
		this.rooms.add(room);
	}
	
	public void addStudent(int roomId, int age, String name, String degree) {
		if(rooms.isEmpty()) {
			throw new RuntimeException("Room is empty");
		}
				
		Room room = rooms.get(roomId);
		room.addStudent(age, name, degree);
	}
	
	public void printAllStudent() {
		for(int i = 0; i < rooms.size(); i++) {
			Room room = rooms.get(i);
			room.printRoom();
			room.printStudents();
			System.out.println();
		}
	}
}
