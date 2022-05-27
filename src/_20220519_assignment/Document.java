package _20220519_assignment;

import java.util.HashMap;

public class Document {
	private final String text;
	private final boolean[] authority = new boolean[100];
	private final HashMap<Account, Integer> hashMap = new HashMap<>();
	
	public Document(String text, Account originalWriter) {
		this.text = text;
		this.authority[(int)originalWriter.getId()] = true;
	}
	
	public void read(Account account) {
		if(this.authority[(int)account.getId()] == false) {
			return;
		}
		System.out.println(this);
	}
	
	public void share(Account account) {
		this.authority[(int)account.getId()] = true;
	}
	
	@Override
	public String toString() {
		return this.text;
	}
}
