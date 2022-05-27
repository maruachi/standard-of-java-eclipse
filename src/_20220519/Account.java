package _20220519;

public class Account {
	private final long id;
	private final String name;
	
	public Account(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	protected long getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
	
	
}
