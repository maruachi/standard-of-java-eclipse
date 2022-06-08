package school;

public class Room {
	private String name;
	private int id;
	private Person[] person = new Person[5];
	
	public Room(String name, int id, Person[] person) {
		this.name = name;
		this.id = id;
		this.person = person;
	}
	
	public void printRoom() {
		for(int i = 0; i < person.length; i++) {
			person[i].printPerson();
		}
	}
	
	public void printDegPerson(String degree) {
		for(int i = 0; i < person.length; i++) {
			if(person[i].detDegree(degree)) {
				person[i].printPerson();
			}
		}
	}
}
