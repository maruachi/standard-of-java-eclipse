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
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Account)) {
			return false;
		}
		
		Account other = (Account) o;
		
		return this.id == other.id && this.name.equals(other.name);
	}
}
