package _20220519_assignment;

public class Account {
	private final String name;
	private final long id;
	
	public Account(String name, int id) {		
		this.name = name;
		this.id = id;
	}

	public long getId() {
		return this.id;
	}
}
