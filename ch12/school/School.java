package school;
public class School {
	private String name;
	private Room[] room = new Room[2];
	
	public School(String name, Room[] room) {
		this.name = name;
		this.room = room;
	}
	
	public void printAllStudent() {
		for(int i = 0; i < room.length; i++) {
			room[i].printRoom();
		}
	}
	
	public void printDegStudent(String degree) {
		for(int i = 0; i < room.length; i++) {
			room[i].printDegPerson(degree);
		}
	}
}