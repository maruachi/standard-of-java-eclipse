package _20220519;

public class Document {
	private final String text;
	private final boolean[] authority = new boolean[100];
	
	public Document(String text, Account originalWriter) {
		this.text = text;
		this.authority[(int)originalWriter.getId()] = true;
	}
	
	public void share(Account account) {
		LogUtills.print("[Share] give a right to {0}", account);
		this.authority[(int)account.getId()] = true;
	}
	
	public void read(Account account) {
		if(!this.authority[(int) account.getId()]) {
			LogUtills.print("No right to account {0}", account);
			return;
		}
		
		LogUtills.print("[Read] {0} \"{1}\"", account, this.text);
	}
}
