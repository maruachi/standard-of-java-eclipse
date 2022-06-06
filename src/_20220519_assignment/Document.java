package _20220519_assignment;

import java.util.HashMap;

public class Document {
	private final String text;
	private final HashMap<Account, Boolean> authority = new HashMap<>();
	
	public Document(String text, Account originalWriter) {
		this.text = text;
		authority.put(originalWriter, true);
	}
	
	public void read(Account account) {
		if(this.authority.get(account) == false) {
			return;
		}
		System.out.println(this);
	}
	
	public void share(Account account) {
		authority.put(account, true);;
	}
	
	@Override
	public String toString() {
		return this.text;
	}
}
